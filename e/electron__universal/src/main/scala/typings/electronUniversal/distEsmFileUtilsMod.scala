package typings.electronUniversal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmFileUtilsMod {
  
  @JSImport("@electron/universal/dist/esm/file-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait AppFileType extends StObject
  @JSImport("@electron/universal/dist/esm/file-utils", "AppFileType")
  @js.native
  object AppFileType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AppFileType & Double] = js.native
    
    @js.native
    sealed trait APP_CODE
      extends StObject
         with AppFileType
    /* 4 */ val APP_CODE: typings.electronUniversal.distEsmFileUtilsMod.AppFileType.APP_CODE & Double = js.native
    
    @js.native
    sealed trait INFO_PLIST
      extends StObject
         with AppFileType
    /* 2 */ val INFO_PLIST: typings.electronUniversal.distEsmFileUtilsMod.AppFileType.INFO_PLIST & Double = js.native
    
    @js.native
    sealed trait MACHO
      extends StObject
         with AppFileType
    /* 0 */ val MACHO: typings.electronUniversal.distEsmFileUtilsMod.AppFileType.MACHO & Double = js.native
    
    @js.native
    sealed trait PLAIN
      extends StObject
         with AppFileType
    /* 1 */ val PLAIN: typings.electronUniversal.distEsmFileUtilsMod.AppFileType.PLAIN & Double = js.native
    
    @js.native
    sealed trait SNAPSHOT
      extends StObject
         with AppFileType
    /* 3 */ val SNAPSHOT: typings.electronUniversal.distEsmFileUtilsMod.AppFileType.SNAPSHOT & Double = js.native
  }
  
  inline def getAllAppFiles(appPath: String): js.Promise[js.Array[AppFile]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllAppFiles")(appPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[AppFile]]]
  
  trait AppFile extends StObject {
    
    var relativePath: String
    
    var `type`: AppFileType
  }
  object AppFile {
    
    inline def apply(relativePath: String, `type`: AppFileType): AppFile = {
      val __obj = js.Dynamic.literal(relativePath = relativePath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppFile]
    }
    
    extension [Self <: AppFile](x: Self) {
      
      inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      inline def setType(value: AppFileType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

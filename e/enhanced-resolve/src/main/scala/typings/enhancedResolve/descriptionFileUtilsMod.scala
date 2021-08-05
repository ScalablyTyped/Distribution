package typings.enhancedResolve

import typings.enhancedResolve.concordMod.Concord
import typings.enhancedResolve.concordMod.Dictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object descriptionFileUtilsMod {
  
  @JSImport("enhanced-resolve/lib/DescriptionFileUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cdUp(directory: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("cdUp")(directory.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getField(content: Null, field: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getField")(content.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getField(content: Dictionary[js.Any], field: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getField")(content.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def loadDescriptionFile(
    resolver: typings.enhancedResolve.resolverMod.^,
    directory: String,
    filenames: js.Array[String],
    callback: js.Function2[
      /* err */ js.UndefOr[Error | Null], 
      /* result */ js.UndefOr[LoadDescriptionFileResult], 
      js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadDescriptionFile")(resolver.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], filenames.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait DescriptionFileData extends StObject {
    
    var browser: js.UndefOr[Dictionary[String | Boolean]] = js.undefined
    
    var concord: js.UndefOr[Concord] = js.undefined
  }
  object DescriptionFileData {
    
    inline def apply(): DescriptionFileData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescriptionFileData]
    }
    
    extension [Self <: DescriptionFileData](x: Self) {
      
      inline def setBrowser(value: Dictionary[String | Boolean]): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setConcord(value: Concord): Self = StObject.set(x, "concord", value.asInstanceOf[js.Any])
      
      inline def setConcordUndefined: Self = StObject.set(x, "concord", js.undefined)
    }
  }
  
  trait LoadDescriptionFileResult extends StObject {
    
    var content: DescriptionFileData
    
    var directory: String
    
    var path: String
  }
  object LoadDescriptionFileResult {
    
    inline def apply(content: DescriptionFileData, directory: String, path: String): LoadDescriptionFileResult = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadDescriptionFileResult]
    }
    
    extension [Self <: LoadDescriptionFileResult](x: Self) {
      
      inline def setContent(value: DescriptionFileData): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}

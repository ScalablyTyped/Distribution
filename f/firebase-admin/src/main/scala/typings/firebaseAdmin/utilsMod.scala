package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.coreMod.App
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("firebase-admin/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addReadonlyGetter(obj: js.Object, prop: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addReadonlyGetter")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findProjectId(app: App): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findProjectId")(app.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  
  inline def findServiceAccountEmail(app: App): js.Promise[String | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findServiceAccountEmail")(app.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String | Null]]
  
  inline def formatString(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatString(str: String, params: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(str.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generateUpdateMask(obj: Any): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUpdateMask")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def generateUpdateMask(obj: Any, terminalPaths: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateUpdateMask")(obj.asInstanceOf[js.Any], terminalPaths.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def generateUpdateMask(obj: Any, terminalPaths: js.Array[String], root: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateUpdateMask")(obj.asInstanceOf[js.Any], terminalPaths.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def generateUpdateMask(obj: Any, terminalPaths: Unit, root: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateUpdateMask")(obj.asInstanceOf[js.Any], terminalPaths.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def getExplicitProjectId(app: App): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExplicitProjectId")(app.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getExplicitServiceAccountEmail(app: App): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getExplicitServiceAccountEmail")(app.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def getSdkVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSdkVersion")().asInstanceOf[String]
  
  inline def parseResourceName(resourceName: String, resourceIdKey: String): ParsedResource = (^.asInstanceOf[js.Dynamic].applyDynamic("parseResourceName")(resourceName.asInstanceOf[js.Any], resourceIdKey.asInstanceOf[js.Any])).asInstanceOf[ParsedResource]
  
  inline def renameProperties(obj: StringDictionary[Any], keyMap: StringDictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renameProperties")(obj.asInstanceOf[js.Any], keyMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toWebSafeBase64(data: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toWebSafeBase64")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def transformMillisecondsToSecondsString(milliseconds: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformMillisecondsToSecondsString")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait ParsedResource extends StObject {
    
    var locationId: js.UndefOr[String] = js.undefined
    
    var projectId: js.UndefOr[String] = js.undefined
    
    var resourceId: String
  }
  object ParsedResource {
    
    inline def apply(resourceId: String): ParsedResource = {
      val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedResource]
    }
    
    extension [Self <: ParsedResource](x: Self) {
      
      inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
      
      inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    }
  }
}

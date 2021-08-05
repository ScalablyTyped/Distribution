package typings.enhancedResolve

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concordMod {
  
  @JSImport("enhanced-resolve/lib/concord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getExtensions(context: ConcordContext, configuration: Concord): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getExtensions")(context.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getField(context: ConcordContext, configuration: Concord, field: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getField")(context.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getMain(context: ConcordContext, configuration: Concord): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMain")(context.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def isConditionMatched(context: ConcordContext, condition: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isConditionMatched")(context.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEnvironment(context: ConcordContext, env: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnvironment")(context.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isEnvironment(context: ConcordContext, env: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnvironment")(context.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isGlobMatched(glob: String, relativePath: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isGlobMatched")(glob.asInstanceOf[js.Any], relativePath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isKeyMatched(context: ConcordContext, key: String): String | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isKeyMatched")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String | Boolean]
  
  inline def isResourceTypeSupported(context: ConcordContext, `type`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isResourceTypeSupported")(context.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isTypeMatched(baseType: String, testedType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeMatched")(baseType.asInstanceOf[js.Any], testedType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTypeMatched(baseType: String, testedType: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeMatched")(baseType.asInstanceOf[js.Any], testedType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTypeMatched(baseType: Type, testedType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeMatched")(baseType.asInstanceOf[js.Any], testedType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isTypeMatched(baseType: Type, testedType: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeMatched")(baseType.asInstanceOf[js.Any], testedType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def matchModule(context: ConcordContext, configuration: Concord, request: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("matchModule")(context.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def matchType(context: ConcordContext, configuration: Concord, relativePath: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchType")(context.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any], relativePath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def parseType(`type`: String): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("parseType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  trait Concord extends StObject {
    
    var `[server] main`: String
    
    var extensions: js.Array[String]
    
    var main: String
    
    var modules: Dictionary[String]
    
    var types: Dictionary[String]
  }
  object Concord {
    
    inline def apply(
      `[server] main`: String,
      extensions: js.Array[String],
      main: String,
      modules: Dictionary[String],
      types: Dictionary[String]
    ): Concord = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.updateDynamic("[server] main")((`[server] main`).asInstanceOf[js.Any])
      __obj.asInstanceOf[Concord]
    }
    
    extension [Self <: Concord](x: Self) {
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      inline def setModules(value: Dictionary[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: Dictionary[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def `set[server] main`(value: String): Self = StObject.set(x, "[server] main", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConcordContext extends StObject {
    
    var environments: js.UndefOr[js.Array[String]] = js.undefined
    
    var referrer: js.UndefOr[String] = js.undefined
    
    var supportedResourceTypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ConcordContext {
    
    inline def apply(): ConcordContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConcordContext]
    }
    
    extension [Self <: ConcordContext](x: Self) {
      
      inline def setEnvironments(value: js.Array[String]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
      
      inline def setEnvironmentsVarargs(value: String*): Self = StObject.set(x, "environments", js.Array(value :_*))
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setSupportedResourceTypes(value: js.Array[String]): Self = StObject.set(x, "supportedResourceTypes", value.asInstanceOf[js.Any])
      
      inline def setSupportedResourceTypesUndefined: Self = StObject.set(x, "supportedResourceTypes", js.undefined)
      
      inline def setSupportedResourceTypesVarargs(value: String*): Self = StObject.set(x, "supportedResourceTypes", js.Array(value :_*))
    }
  }
  
  type Dictionary[T] = StringDictionary[T]
  
  trait Type extends StObject {
    
    var features: js.Array[String]
    
    var `type`: js.UndefOr[String | Null] = js.undefined
  }
  object Type {
    
    inline def apply(features: js.Array[String]): Type = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}

package typings.enhancedResolve

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concordMod {
  
  @JSImport("enhanced-resolve/lib/concord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getExtensions(context: ConcordContext, configuration: Concord): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getExtensions")(context.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getField(context: ConcordContext, configuration: Concord, field: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getField")(context.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getMain(context: ConcordContext, configuration: Concord): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getMain")(context.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def isConditionMatched(context: ConcordContext, condition: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isConditionMatched")(context.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isEnvironment(context: ConcordContext, env: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnvironment")(context.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isEnvironment(context: ConcordContext, env: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnvironment")(context.asInstanceOf[js.Any], env.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isGlobMatched(glob: String, relativePath: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isGlobMatched")(glob.asInstanceOf[js.Any], relativePath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isKeyMatched(context: ConcordContext, key: String): String | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isKeyMatched")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String | Boolean]
  
  @scala.inline
  def isResourceTypeSupported(context: ConcordContext, `type`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isResourceTypeSupported")(context.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isTypeMatched(baseType: String, testedType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeMatched")(baseType.asInstanceOf[js.Any], testedType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isTypeMatched(baseType: String, testedType: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeMatched")(baseType.asInstanceOf[js.Any], testedType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isTypeMatched(baseType: Type, testedType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeMatched")(baseType.asInstanceOf[js.Any], testedType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isTypeMatched(baseType: Type, testedType: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeMatched")(baseType.asInstanceOf[js.Any], testedType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def matchModule(context: ConcordContext, configuration: Concord, request: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("matchModule")(context.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def matchType(context: ConcordContext, configuration: Concord, relativePath: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("matchType")(context.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any], relativePath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def parseType(`type`: String): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("parseType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  trait Concord extends StObject {
    
    var `[server] main`: String
    
    var extensions: js.Array[String]
    
    var main: String
    
    var modules: Dictionary[String]
    
    var types: Dictionary[String]
  }
  object Concord {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ConcordMutableBuilder[Self <: Concord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModules(value: Dictionary[String]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypes(value: Dictionary[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set[server] main`(value: String): Self = StObject.set(x, "[server] main", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConcordContext extends StObject {
    
    var environments: js.UndefOr[js.Array[String]] = js.undefined
    
    var referrer: js.UndefOr[String] = js.undefined
    
    var supportedResourceTypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ConcordContext {
    
    @scala.inline
    def apply(): ConcordContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConcordContext]
    }
    
    @scala.inline
    implicit class ConcordContextMutableBuilder[Self <: ConcordContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvironments(value: js.Array[String]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
      
      @scala.inline
      def setEnvironmentsVarargs(value: String*): Self = StObject.set(x, "environments", js.Array(value :_*))
      
      @scala.inline
      def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      @scala.inline
      def setSupportedResourceTypes(value: js.Array[String]): Self = StObject.set(x, "supportedResourceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportedResourceTypesUndefined: Self = StObject.set(x, "supportedResourceTypes", js.undefined)
      
      @scala.inline
      def setSupportedResourceTypesVarargs(value: String*): Self = StObject.set(x, "supportedResourceTypes", js.Array(value :_*))
    }
  }
  
  type Dictionary[T] = StringDictionary[T]
  
  trait Type extends StObject {
    
    var features: js.Array[String]
    
    var `type`: js.UndefOr[String | Null] = js.undefined
  }
  object Type {
    
    @scala.inline
    def apply(features: js.Array[String]): Type = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}

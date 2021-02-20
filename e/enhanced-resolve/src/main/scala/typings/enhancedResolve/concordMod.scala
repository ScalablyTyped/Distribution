package typings.enhancedResolve

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concordMod {
  
  @JSImport("enhanced-resolve/lib/concord", "getExtensions")
  @js.native
  def getExtensions(context: ConcordContext, configuration: Concord): js.Any = js.native
  
  @JSImport("enhanced-resolve/lib/concord", "getField")
  @js.native
  def getField(context: ConcordContext, configuration: Concord, field: String): js.Any = js.native
  
  @JSImport("enhanced-resolve/lib/concord", "getMain")
  @js.native
  def getMain(context: ConcordContext, configuration: Concord): js.Any = js.native
  
  @JSImport("enhanced-resolve/lib/concord", "isConditionMatched")
  @js.native
  def isConditionMatched(context: ConcordContext, condition: String): Boolean = js.native
  
  @JSImport("enhanced-resolve/lib/concord", "isEnvironment")
  @js.native
  def isEnvironment(context: ConcordContext, env: String): Boolean = js.native
  @JSImport("enhanced-resolve/lib/concord", "isEnvironment")
  @js.native
  def isEnvironment(context: ConcordContext, env: Type): Boolean = js.native
  
  @JSImport("enhanced-resolve/lib/concord", "isGlobMatched")
  @js.native
  def isGlobMatched(glob: String, relativePath: String): Boolean = js.native
  
  @JSImport("enhanced-resolve/lib/concord", "isKeyMatched")
  @js.native
  def isKeyMatched(context: ConcordContext, key: String): String | Boolean = js.native
  
  @JSImport("enhanced-resolve/lib/concord", "isResourceTypeSupported")
  @js.native
  def isResourceTypeSupported(context: ConcordContext, `type`: String): Boolean = js.native
  
  @JSImport("enhanced-resolve/lib/concord", "isTypeMatched")
  @js.native
  def isTypeMatched(baseType: String, testedType: String): Boolean = js.native
  @JSImport("enhanced-resolve/lib/concord", "isTypeMatched")
  @js.native
  def isTypeMatched(baseType: String, testedType: Type): Boolean = js.native
  @JSImport("enhanced-resolve/lib/concord", "isTypeMatched")
  @js.native
  def isTypeMatched(baseType: Type, testedType: String): Boolean = js.native
  @JSImport("enhanced-resolve/lib/concord", "isTypeMatched")
  @js.native
  def isTypeMatched(baseType: Type, testedType: Type): Boolean = js.native
  
  @JSImport("enhanced-resolve/lib/concord", "matchModule")
  @js.native
  def matchModule(context: ConcordContext, configuration: Concord, request: String): js.Any = js.native
  
  @JSImport("enhanced-resolve/lib/concord", "matchType")
  @js.native
  def matchType(context: ConcordContext, configuration: Concord, relativePath: String): js.UndefOr[String] = js.native
  
  @JSImport("enhanced-resolve/lib/concord", "parseType")
  @js.native
  def parseType(`type`: String): Type = js.native
  
  @js.native
  trait Concord extends StObject {
    
    var `[server] main`: String = js.native
    
    var extensions: js.Array[String] = js.native
    
    var main: String = js.native
    
    var modules: Dictionary[String] = js.native
    
    var types: Dictionary[String] = js.native
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
  
  @js.native
  trait ConcordContext extends StObject {
    
    var environments: js.UndefOr[js.Array[String]] = js.native
    
    var referrer: js.UndefOr[String] = js.native
    
    var supportedResourceTypes: js.UndefOr[js.Array[String]] = js.native
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
  
  @js.native
  trait Type extends StObject {
    
    var features: js.Array[String] = js.native
    
    var `type`: js.UndefOr[String | Null] = js.native
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

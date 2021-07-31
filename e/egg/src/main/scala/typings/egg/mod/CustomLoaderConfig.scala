package typings.egg.mod

import typings.egg.eggStrings.app
import typings.egg.eggStrings.ctx
import typings.eggCore.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent egg.egg.RemoveSpecProp<egg-core.egg-core.FileLoaderOption, 'inject' | 'target'> */
trait CustomLoaderConfig extends StObject {
  
  var call: js.UndefOr[Boolean] = js.undefined
  
  var caseStyle: js.UndefOr[String | (js.Function1[/* str */ String, js.Array[String]])] = js.undefined
  
  var directory: String | js.Array[String]
  
  var filter: js.UndefOr[js.Function1[/* obj */ js.Object, Boolean]] = js.undefined
  
  var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var initializer: js.UndefOr[js.Function2[/* obj */ js.Object, /* options */ Path, js.Any]] = js.undefined
  
  /**
    * an object you wanner load to, value can only be 'ctx' or 'app'. default to app
    */
  var inject: js.UndefOr[ctx | app] = js.undefined
  
  /**
    * whether need to load files in plugins or framework, default to false
    */
  var loadunit: js.UndefOr[Boolean] = js.undefined
  
  var `match`: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var `override`: js.UndefOr[Boolean] = js.undefined
}
object CustomLoaderConfig {
  
  @scala.inline
  def apply(directory: String | js.Array[String]): CustomLoaderConfig = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLoaderConfig]
  }
  
  @scala.inline
  implicit class CustomLoaderConfigMutableBuilder[Self <: CustomLoaderConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCall(value: Boolean): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
    
    @scala.inline
    def setCaseStyle(value: String | (js.Function1[/* str */ String, js.Array[String]])): Self = StObject.set(x, "caseStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseStyleFunction1(value: /* str */ String => js.Array[String]): Self = StObject.set(x, "caseStyle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCaseStyleUndefined: Self = StObject.set(x, "caseStyle", js.undefined)
    
    @scala.inline
    def setDirectory(value: String | js.Array[String]): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryVarargs(value: String*): Self = StObject.set(x, "directory", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: /* obj */ js.Object => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
    
    @scala.inline
    def setInitializer(value: (/* obj */ js.Object, /* options */ Path) => js.Any): Self = StObject.set(x, "initializer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInitializerUndefined: Self = StObject.set(x, "initializer", js.undefined)
    
    @scala.inline
    def setInject(value: ctx | app): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
    
    @scala.inline
    def setLoadunit(value: Boolean): Self = StObject.set(x, "loadunit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadunitUndefined: Self = StObject.set(x, "loadunit", js.undefined)
    
    @scala.inline
    def setMatch(value: String | js.Array[String]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setMatchVarargs(value: String*): Self = StObject.set(x, "match", js.Array(value :_*))
    
    @scala.inline
    def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
  }
}

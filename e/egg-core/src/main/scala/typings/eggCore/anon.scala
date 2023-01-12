package typings.eggCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exports extends StObject {
    
    var exports: Any
    
    var fullpath: String
    
    var properties: js.Array[String]
  }
  object Exports {
    
    inline def apply(exports: Any, fullpath: String, properties: js.Array[String]): Exports = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], fullpath = fullpath.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exports]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Exports] (val x: Self) extends AnyVal {
      
      inline def setExports(value: Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      inline def setFullpath(value: String): Self = StObject.set(x, "fullpath", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
    }
  }
  
  trait IsWeakDep extends StObject {
    
    var isWeakDep: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object IsWeakDep {
    
    inline def apply(): IsWeakDep = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsWeakDep]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsWeakDep] (val x: Self) extends AnyVal {
      
      inline def setIsWeakDep(value: Boolean): Self = StObject.set(x, "isWeakDep", value.asInstanceOf[js.Any])
      
      inline def setIsWeakDepUndefined: Self = StObject.set(x, "isWeakDep", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Inlined std.Partial<egg-core.egg-core.ContextLoaderOption> */
  trait PartialContextLoaderOptio extends StObject {
    
    var call: js.UndefOr[Boolean] = js.undefined
    
    var caseStyle: js.UndefOr[String | (js.Function1[/* str */ String, js.Array[String]])] = js.undefined
    
    var directory: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var fieldClass: js.UndefOr[String] = js.undefined
    
    var filter: js.UndefOr[js.Function1[/* obj */ js.Object, Boolean]] = js.undefined
    
    var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var initializer: js.UndefOr[js.Function2[/* obj */ js.Object, /* options */ Path, Any]] = js.undefined
    
    var inject: js.UndefOr[js.Object] = js.undefined
    
    var `match`: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var `override`: js.UndefOr[Boolean] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[js.Object] = js.undefined
  }
  object PartialContextLoaderOptio {
    
    inline def apply(): PartialContextLoaderOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialContextLoaderOptio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialContextLoaderOptio] (val x: Self) extends AnyVal {
      
      inline def setCall(value: Boolean): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      inline def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
      
      inline def setCaseStyle(value: String | (js.Function1[/* str */ String, js.Array[String]])): Self = StObject.set(x, "caseStyle", value.asInstanceOf[js.Any])
      
      inline def setCaseStyleFunction1(value: /* str */ String => js.Array[String]): Self = StObject.set(x, "caseStyle", js.Any.fromFunction1(value))
      
      inline def setCaseStyleUndefined: Self = StObject.set(x, "caseStyle", js.undefined)
      
      inline def setDirectory(value: String | js.Array[String]): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setDirectoryVarargs(value: String*): Self = StObject.set(x, "directory", js.Array(value*))
      
      inline def setFieldClass(value: String): Self = StObject.set(x, "fieldClass", value.asInstanceOf[js.Any])
      
      inline def setFieldClassUndefined: Self = StObject.set(x, "fieldClass", js.undefined)
      
      inline def setFilter(value: /* obj */ js.Object => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setInitializer(value: (/* obj */ js.Object, /* options */ Path) => Any): Self = StObject.set(x, "initializer", js.Any.fromFunction2(value))
      
      inline def setInitializerUndefined: Self = StObject.set(x, "initializer", js.undefined)
      
      inline def setInject(value: js.Object): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setMatch(value: String | js.Array[String]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMatchVarargs(value: String*): Self = StObject.set(x, "match", js.Array(value*))
      
      inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  /* Inlined std.Partial<egg-core.egg-core.FileLoaderOption> */
  trait PartialFileLoaderOption extends StObject {
    
    var call: js.UndefOr[Boolean] = js.undefined
    
    var caseStyle: js.UndefOr[String | (js.Function1[/* str */ String, js.Array[String]])] = js.undefined
    
    var directory: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var filter: js.UndefOr[js.Function1[/* obj */ js.Object, Boolean]] = js.undefined
    
    var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var initializer: js.UndefOr[js.Function2[/* obj */ js.Object, /* options */ Path, Any]] = js.undefined
    
    var inject: js.UndefOr[js.Object] = js.undefined
    
    var `match`: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var `override`: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[js.Object] = js.undefined
  }
  object PartialFileLoaderOption {
    
    inline def apply(): PartialFileLoaderOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFileLoaderOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialFileLoaderOption] (val x: Self) extends AnyVal {
      
      inline def setCall(value: Boolean): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      inline def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
      
      inline def setCaseStyle(value: String | (js.Function1[/* str */ String, js.Array[String]])): Self = StObject.set(x, "caseStyle", value.asInstanceOf[js.Any])
      
      inline def setCaseStyleFunction1(value: /* str */ String => js.Array[String]): Self = StObject.set(x, "caseStyle", js.Any.fromFunction1(value))
      
      inline def setCaseStyleUndefined: Self = StObject.set(x, "caseStyle", js.undefined)
      
      inline def setDirectory(value: String | js.Array[String]): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setDirectoryVarargs(value: String*): Self = StObject.set(x, "directory", js.Array(value*))
      
      inline def setFilter(value: /* obj */ js.Object => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setInitializer(value: (/* obj */ js.Object, /* options */ Path) => Any): Self = StObject.set(x, "initializer", js.Any.fromFunction2(value))
      
      inline def setInitializerUndefined: Self = StObject.set(x, "initializer", js.undefined)
      
      inline def setInject(value: js.Object): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setMatch(value: String | js.Array[String]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMatchVarargs(value: String*): Self = StObject.set(x, "match", js.Array(value*))
      
      inline def setOverride(value: Boolean): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
      
      inline def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait Path extends StObject {
    
    var path: String
    
    var pathName: String
  }
  object Path {
    
    inline def apply(path: String, pathName: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], pathName = pathName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathName(value: String): Self = StObject.set(x, "pathName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var path: String
    
    var `type`: String
  }
  object Type {
    
    inline def apply(path: String, `type`: String): Type = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

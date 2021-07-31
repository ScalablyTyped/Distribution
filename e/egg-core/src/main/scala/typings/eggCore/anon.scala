package typings.eggCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exports extends StObject {
    
    var exports: js.Any
    
    var fullpath: String
    
    var properties: js.Array[String]
  }
  object Exports {
    
    @scala.inline
    def apply(exports: js.Any, fullpath: String, properties: js.Array[String]): Exports = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any], fullpath = fullpath.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exports]
    }
    
    @scala.inline
    implicit class ExportsMutableBuilder[Self <: Exports] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExports(value: js.Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullpath(value: String): Self = StObject.set(x, "fullpath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value :_*))
    }
  }
  
  trait IsWeakDep extends StObject {
    
    var isWeakDep: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object IsWeakDep {
    
    @scala.inline
    def apply(): IsWeakDep = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsWeakDep]
    }
    
    @scala.inline
    implicit class IsWeakDepMutableBuilder[Self <: IsWeakDep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsWeakDep(value: Boolean): Self = StObject.set(x, "isWeakDep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWeakDepUndefined: Self = StObject.set(x, "isWeakDep", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
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
    
    var initializer: js.UndefOr[js.Function2[/* obj */ js.Object, /* options */ Path, js.Any]] = js.undefined
    
    var inject: js.UndefOr[js.Object] = js.undefined
    
    var `match`: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var `override`: js.UndefOr[Boolean] = js.undefined
    
    var property: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[js.Object] = js.undefined
  }
  object PartialContextLoaderOptio {
    
    @scala.inline
    def apply(): PartialContextLoaderOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialContextLoaderOptio]
    }
    
    @scala.inline
    implicit class PartialContextLoaderOptioMutableBuilder[Self <: PartialContextLoaderOptio] (val x: Self) extends AnyVal {
      
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
      def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      @scala.inline
      def setDirectoryVarargs(value: String*): Self = StObject.set(x, "directory", js.Array(value :_*))
      
      @scala.inline
      def setFieldClass(value: String): Self = StObject.set(x, "fieldClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldClassUndefined: Self = StObject.set(x, "fieldClass", js.undefined)
      
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
      def setInject(value: js.Object): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
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
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  /* Inlined std.Partial<egg-core.egg-core.FileLoaderOption> */
  trait PartialFileLoaderOption extends StObject {
    
    var call: js.UndefOr[Boolean] = js.undefined
    
    var caseStyle: js.UndefOr[String | (js.Function1[/* str */ String, js.Array[String]])] = js.undefined
    
    var directory: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var filter: js.UndefOr[js.Function1[/* obj */ js.Object, Boolean]] = js.undefined
    
    var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var initializer: js.UndefOr[js.Function2[/* obj */ js.Object, /* options */ Path, js.Any]] = js.undefined
    
    var inject: js.UndefOr[js.Object] = js.undefined
    
    var `match`: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var `override`: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[js.Object] = js.undefined
  }
  object PartialFileLoaderOption {
    
    @scala.inline
    def apply(): PartialFileLoaderOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFileLoaderOption]
    }
    
    @scala.inline
    implicit class PartialFileLoaderOptionMutableBuilder[Self <: PartialFileLoaderOption] (val x: Self) extends AnyVal {
      
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
      def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
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
      def setInject(value: js.Object): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
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
      
      @scala.inline
      def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait Path extends StObject {
    
    var path: String
    
    var pathName: String
  }
  object Path {
    
    @scala.inline
    def apply(path: String, pathName: String): Path = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], pathName = pathName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathName(value: String): Self = StObject.set(x, "pathName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var path: String
    
    var `type`: String
  }
  object Type {
    
    @scala.inline
    def apply(path: String, `type`: String): Type = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

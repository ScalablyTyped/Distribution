package typings.edgeJs

import typings.edgeJs.edgeJsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("edge-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def func[TInput, TOutput](language: String, params: String): Func_[TInput, TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(language.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Func_[TInput, TOutput]]
  inline def func[TInput, TOutput](language: String, params: js.Function): Func_[TInput, TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(language.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Func_[TInput, TOutput]]
  inline def func[TInput, TOutput](language: String, params: Params): Func_[TInput, TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(language.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Func_[TInput, TOutput]]
  inline def func[TInput, TOutput](language: String, params: Source): Func_[TInput, TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(language.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Func_[TInput, TOutput]]
  inline def func[TInput, TOutput](language: String, params: TSQL): Func_[TInput, TOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(language.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Func_[TInput, TOutput]]
  inline def func[TInput, TOutput](params: String): Func_[TInput, TOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("func")(params.asInstanceOf[js.Any]).asInstanceOf[Func_[TInput, TOutput]]
  inline def func[TInput, TOutput](params: js.Function): Func_[TInput, TOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("func")(params.asInstanceOf[js.Any]).asInstanceOf[Func_[TInput, TOutput]]
  inline def func[TInput, TOutput](params: Params): Func_[TInput, TOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("func")(params.asInstanceOf[js.Any]).asInstanceOf[Func_[TInput, TOutput]]
  inline def func[TInput, TOutput](params: Source): Func_[TInput, TOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("func")(params.asInstanceOf[js.Any]).asInstanceOf[Func_[TInput, TOutput]]
  inline def func[TInput, TOutput](params: TSQL): Func_[TInput, TOutput] = ^.asInstanceOf[js.Dynamic].applyDynamic("func")(params.asInstanceOf[js.Any]).asInstanceOf[Func_[TInput, TOutput]]
  
  @js.native
  trait Func_[TInput, TOutput] extends StObject {
    
    def apply(payload: TInput, callback: js.Function2[/* error */ js.Error, /* result */ TOutput, Unit]): Unit = js.native
    def apply(payload: TInput, sync: `true`): TOutput = js.native
  }
  
  trait Params extends StObject {
    
    var assemblyFile: String
    
    var methodName: js.UndefOr[String] = js.undefined
    
    var typeName: js.UndefOr[String] = js.undefined
  }
  object Params {
    
    inline def apply(assemblyFile: String): Params = {
      val __obj = js.Dynamic.literal(assemblyFile = assemblyFile.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      inline def setAssemblyFile(value: String): Self = StObject.set(x, "assemblyFile", value.asInstanceOf[js.Any])
      
      inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
      
      inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
      
      inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
      
      inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    }
  }
  
  trait Source extends StObject {
    
    var references: js.UndefOr[js.Array[String]] = js.undefined
    
    var source: String | js.Function
  }
  object Source {
    
    inline def apply(source: String | js.Function): Source = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
      
      inline def setReferences(value: js.Array[String]): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
      
      inline def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
      
      inline def setReferencesVarargs(value: String*): Self = StObject.set(x, "references", js.Array(value*))
      
      inline def setSource(value: String | js.Function): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait TSQL extends StObject {
    
    var commandTimeout: js.UndefOr[Double] = js.undefined
    
    var connectionString: js.UndefOr[String] = js.undefined
    
    var source: String
  }
  object TSQL {
    
    inline def apply(source: String): TSQL = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[TSQL]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TSQL] (val x: Self) extends AnyVal {
      
      inline def setCommandTimeout(value: Double): Self = StObject.set(x, "commandTimeout", value.asInstanceOf[js.Any])
      
      inline def setCommandTimeoutUndefined: Self = StObject.set(x, "commandTimeout", js.undefined)
      
      inline def setConnectionString(value: String): Self = StObject.set(x, "connectionString", value.asInstanceOf[js.Any])
      
      inline def setConnectionStringUndefined: Self = StObject.set(x, "connectionString", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}

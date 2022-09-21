package typings.esfxTypeModel

import typings.esfxTypeModel.esfxTypeModelBooleans.`false`
import typings.esfxTypeModel.esfxTypeModelBooleans.`true`
import typings.esfxTypeModel.testMod.ExpectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    def next(): Any = js.native
    def next(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Any = js.native
  }
  
  @js.native
  trait `1` extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[`0`] = js.native
  }
  
  trait `2` extends StObject {
    
    def next(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): js.Thenable[
        /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any
      ]
  }
  object `2` {
    
    inline def apply(
      next: Any => js.Thenable[
          /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any
        ]
    ): `2` = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[`2`]
    }
    
    extension [Self <: `2`](x: Self) {
      
      inline def setNext(
        value: Any => js.Thenable[
              /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any
            ]
      ): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait `3` extends StObject
  
  trait ActualExpected[Expected, Actual]
    extends StObject
       with ExpectType[Actual, Expected] {
    
    var Actual: Actual
    
    var Expected: Expected
    
    var pass: `false`
  }
  object ActualExpected {
    
    inline def apply[Expected, Actual](Actual: Actual, Expected: Expected): ActualExpected[Expected, Actual] = {
      val __obj = js.Dynamic.literal(Actual = Actual.asInstanceOf[js.Any], Expected = Expected.asInstanceOf[js.Any], pass = false)
      __obj.asInstanceOf[ActualExpected[Expected, Actual]]
    }
    
    extension [Self <: ActualExpected[?, ?], Expected, Actual](x: Self & (ActualExpected[Expected, Actual])) {
      
      inline def setActual(value: Actual): Self = StObject.set(x, "Actual", value.asInstanceOf[js.Any])
      
      inline def setExpected(value: Expected): Self = StObject.set(x, "Expected", value.asInstanceOf[js.Any])
      
      inline def setPass(value: `false`): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AsyncIterator extends StObject
  
  trait Done extends StObject {
    
    var done: js.UndefOr[Boolean] = js.undefined
    
    var value: Any
  }
  object Done {
    
    inline def apply(value: Any): Done = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done]
    }
    
    extension [Self <: Done](x: Self) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Iterator extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[Next] = js.native
  }
  
  trait Next extends StObject {
    
    def next(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
    ): /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any
  }
  object Next {
    
    inline def apply(
      next: Any => /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any
    ): Next = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
      __obj.asInstanceOf[Next]
    }
    
    extension [Self <: Next](x: Self) {
      
      inline def setNext(
        value: Any => /* import warning: importer.ImportType#apply Failed type conversion: infer R */ js.Any
      ): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  trait Pass
    extends StObject
       with ExpectType[Any, Any] {
    
    var pass: `true`
  }
  object Pass {
    
    inline def apply(): Pass = {
      val __obj = js.Dynamic.literal(pass = true)
      __obj.asInstanceOf[Pass]
    }
    
    extension [Self <: Pass](x: Self) {
      
      inline def setPass(value: `true`): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    }
  }
  
  trait Then extends StObject {
    
    def `then`(
      onfulfilled: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
    ): Any
  }
  object Then {
    
    inline def apply(
      `then`: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any => Any
    ): Then = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
      __obj.asInstanceOf[Then]
    }
    
    extension [Self <: Then](x: Self) {
      
      inline def setThen(
        value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any => Any
      ): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
    }
  }
  
  trait Value extends StObject {
    
    var done: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object Value {
    
    inline def apply(): Value = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}

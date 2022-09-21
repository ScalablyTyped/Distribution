package typings.expectations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Expectations {
  
  @js.native
  trait Expect extends StObject {
    
    var assertions: IAssertions = js.native
    
    var expr: Any = js.native
    
    def fail(): Any = js.native
    def fail(why: String): Any = js.native
    def fail(why: String, what: Any): Any = js.native
    def fail(why: Unit, what: Any): Any = js.native
    
    def generateMessage(value: Any, expr: Any, toDo: String): String = js.native
    def generateMessage(value: Any, expr: Any, toDo: String, otherVal: Any): String = js.native
    
    var not: Expect = js.native
    
    var parent: Expect = js.native
    
    def pass(): Any = js.native
    
    def toBe(`val`: Any): Any = js.native
    
    def toBeDefined(): Any = js.native
    
    def toBeFalsey(): Any = js.native
    
    def toBeFalsy(): Any = js.native
    
    def toBeGreaterThan(`val`: Any): Any = js.native
    
    def toBeLessThan(`val`: Any): Any = js.native
    
    def toBeNull(): Any = js.native
    
    def toBeTruthy(): Any = js.native
    
    def toBeUndefined(): Any = js.native
    
    def toContain(`val`: Any): Any = js.native
    
    def toEqual(`val`: Any): Any = js.native
    
    def toMatch(`val`: Any): Any = js.native
    
    def toNotEqual(`val`: Any): Any = js.native
    
    def toThrow(): Any = js.native
    
    var value: Any = js.native
  }
  
  @js.native
  trait IAssertions extends StObject {
    
    def fail(message: String): Any = js.native
    
    def pass(): Any = js.native
    def pass(message: String): Any = js.native
  }
  
  @js.native
  trait IExpectations extends StObject {
    
    def apply(value: Any): Expect = js.native
    
    def addAssertion(name: String, matcher: js.Function): Unit = js.native
  }
}

package typings.expectations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Expectations")
@js.native
object Expectations extends js.Object {
  
  @js.native
  trait Expect extends js.Object {
    
    var assertions: IAssertions = js.native
    
    var expr: js.Any = js.native
    
    def fail(): js.Any = js.native
    def fail(why: js.UndefOr[scala.Nothing], what: js.Any): js.Any = js.native
    def fail(why: String): js.Any = js.native
    def fail(why: String, what: js.Any): js.Any = js.native
    
    def generateMessage(value: js.Any, expr: js.Any, toDo: String): String = js.native
    def generateMessage(value: js.Any, expr: js.Any, toDo: String, otherVal: js.Any): String = js.native
    
    var not: Expect = js.native
    
    var parent: Expect = js.native
    
    def pass(): js.Any = js.native
    
    def toBe(`val`: js.Any): js.Any = js.native
    
    def toBeDefined(): js.Any = js.native
    
    def toBeFalsey(): js.Any = js.native
    
    def toBeFalsy(): js.Any = js.native
    
    def toBeGreaterThan(`val`: js.Any): js.Any = js.native
    
    def toBeLessThan(`val`: js.Any): js.Any = js.native
    
    def toBeNull(): js.Any = js.native
    
    def toBeTruthy(): js.Any = js.native
    
    def toBeUndefined(): js.Any = js.native
    
    def toContain(`val`: js.Any): js.Any = js.native
    
    def toEqual(`val`: js.Any): js.Any = js.native
    
    def toMatch(`val`: js.Any): js.Any = js.native
    
    def toNotEqual(`val`: js.Any): js.Any = js.native
    
    def toThrow(): js.Any = js.native
    
    var value: js.Any = js.native
  }
  
  @js.native
  trait IAssertions extends js.Object {
    
    def fail(message: String): js.Any = js.native
    
    def pass(): js.Any = js.native
    def pass(message: String): js.Any = js.native
  }
  
  @js.native
  trait IExpectations extends js.Object {
    
    def apply(value: js.Any): Expect = js.native
    
    def addAssertion(name: String, matcher: js.Function): Unit = js.native
  }
}

package typings.expect.anon

import typings.expect.typesMod.Tester
import typings.jestTypes.configMod.Path
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<expect.expect/build/types.MatcherState> */
@js.native
trait PartialMatcherState extends js.Object {
  
  var assertionCalls: js.UndefOr[Double] = js.native
  
  var currentTestName: js.UndefOr[String] = js.native
  
  var dontThrow: js.UndefOr[js.Function0[Unit]] = js.native
  
  @JSName("equals")
  var equals_FPartialMatcherState: js.UndefOr[
    js.Function4[
      /* a */ js.Any, 
      /* b */ js.Any, 
      /* customTesters */ js.UndefOr[js.Array[Tester]], 
      /* strictCheck */ js.UndefOr[Boolean], 
      Boolean
    ]
  ] = js.native
  
  var error: js.UndefOr[Error] = js.native
  
  var expand: js.UndefOr[Boolean] = js.native
  
  var expectedAssertionsNumber: js.UndefOr[Double | Null] = js.native
  
  var expectedAssertionsNumberError: js.UndefOr[Error] = js.native
  
  var isExpectingAssertions: js.UndefOr[Boolean] = js.native
  
  var isExpectingAssertionsError: js.UndefOr[Error] = js.native
  
  var isNot: js.UndefOr[Boolean] = js.native
  
  var promise: js.UndefOr[String] = js.native
  
  var suppressedErrors: js.UndefOr[js.Array[Error]] = js.native
  
  var testPath: js.UndefOr[Path] = js.native
  
  var utils: js.UndefOr[readonlyprintExpectedvalu] = js.native
}
object PartialMatcherState {
  
  @scala.inline
  def apply(): PartialMatcherState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMatcherState]
  }
  
  @scala.inline
  implicit class PartialMatcherStateOps[Self <: PartialMatcherState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssertionCalls(value: Double): Self = this.set("assertionCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssertionCalls: Self = this.set("assertionCalls", js.undefined)
    
    @scala.inline
    def setCurrentTestName(value: String): Self = this.set("currentTestName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentTestName: Self = this.set("currentTestName", js.undefined)
    
    @scala.inline
    def setDontThrow(value: () => Unit): Self = this.set("dontThrow", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDontThrow: Self = this.set("dontThrow", js.undefined)
    
    @scala.inline
    def setEquals(
      value: (/* a */ js.Any, /* b */ js.Any, /* customTesters */ js.UndefOr[js.Array[Tester]], /* strictCheck */ js.UndefOr[Boolean]) => Boolean
    ): Self = this.set("equals", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExpand(value: Boolean): Self = this.set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpand: Self = this.set("expand", js.undefined)
    
    @scala.inline
    def setExpectedAssertionsNumber(value: Double): Self = this.set("expectedAssertionsNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedAssertionsNumber: Self = this.set("expectedAssertionsNumber", js.undefined)
    
    @scala.inline
    def setExpectedAssertionsNumberNull: Self = this.set("expectedAssertionsNumber", null)
    
    @scala.inline
    def setExpectedAssertionsNumberError(value: Error): Self = this.set("expectedAssertionsNumberError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpectedAssertionsNumberError: Self = this.set("expectedAssertionsNumberError", js.undefined)
    
    @scala.inline
    def setIsExpectingAssertions(value: Boolean): Self = this.set("isExpectingAssertions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExpectingAssertions: Self = this.set("isExpectingAssertions", js.undefined)
    
    @scala.inline
    def setIsExpectingAssertionsError(value: Error): Self = this.set("isExpectingAssertionsError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExpectingAssertionsError: Self = this.set("isExpectingAssertionsError", js.undefined)
    
    @scala.inline
    def setIsNot(value: Boolean): Self = this.set("isNot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNot: Self = this.set("isNot", js.undefined)
    
    @scala.inline
    def setPromise(value: String): Self = this.set("promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromise: Self = this.set("promise", js.undefined)
    
    @scala.inline
    def setSuppressedErrorsVarargs(value: Error*): Self = this.set("suppressedErrors", js.Array(value :_*))
    
    @scala.inline
    def setSuppressedErrors(value: js.Array[Error]): Self = this.set("suppressedErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressedErrors: Self = this.set("suppressedErrors", js.undefined)
    
    @scala.inline
    def setTestPath(value: Path): Self = this.set("testPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestPath: Self = this.set("testPath", js.undefined)
    
    @scala.inline
    def setUtils(value: readonlyprintExpectedvalu): Self = this.set("utils", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtils: Self = this.set("utils", js.undefined)
  }
}

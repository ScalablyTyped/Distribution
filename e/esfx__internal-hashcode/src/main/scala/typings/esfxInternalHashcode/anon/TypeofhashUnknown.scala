package typings.esfxInternalHashcode.anon

import typings.std.Partial
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofhashUnknown extends js.Object {
  
  def getState(): BigIntSeed = js.native
  
  @JSName("setState")
  def setState_getState(
    state: Partial[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof hashUnknown['getState'] */ js.Any
      ]
    ]
  ): Unit = js.native
}
object TypeofhashUnknown {
  
  @scala.inline
  def apply(
    getState: () => BigIntSeed,
    setState: Partial[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof hashUnknown['getState'] */ js.Any
      ]
    ] => Unit
  ): TypeofhashUnknown = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState))
    __obj.asInstanceOf[TypeofhashUnknown]
  }
  
  @scala.inline
  implicit class TypeofhashUnknownOps[Self <: TypeofhashUnknown] (val x: Self) extends AnyVal {
    
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
    def setGetState(value: () => BigIntSeed): Self = this.set("getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetState(
      value: Partial[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: typeof hashUnknown['getState'] */ js.Any
          ]
        ] => Unit
    ): Self = this.set("setState", js.Any.fromFunction1(value))
  }
}

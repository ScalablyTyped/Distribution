package typings.enzyme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoreProps extends js.Object {
  
  /** Whether props should be omitted in the resulting string. Props are included by default. */
  var ignoreProps: js.UndefOr[Boolean] = js.native
  
  /** Whether arrays and objects passed as props should be verbosely printed. */
  var verbose: js.UndefOr[Boolean] = js.native
}
object IgnoreProps {
  
  @scala.inline
  def apply(): IgnoreProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreProps]
  }
  
  @scala.inline
  implicit class IgnorePropsOps[Self <: IgnoreProps] (val x: Self) extends AnyVal {
    
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
    def setIgnoreProps(value: Boolean): Self = this.set("ignoreProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreProps: Self = this.set("ignoreProps", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}

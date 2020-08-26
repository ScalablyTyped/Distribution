package typings.extjs.Ext.data

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIdGenerator extends IBase {
  /** [Method] Generates and returns the next id
    * @returns String The next id.
    */
  var generate: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.native
  /** [Property] (Boolean) */
  var isGenerator: js.UndefOr[Boolean] = js.native
}

object IIdGenerator {
  @scala.inline
  def apply(): IIdGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIdGenerator]
  }
  @scala.inline
  implicit class IIdGeneratorOps[Self <: IIdGenerator] (val x: Self) extends AnyVal {
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
    def setGenerate(value: () => String): Self = this.set("generate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGenerate: Self = this.set("generate", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsGenerator(value: Boolean): Self = this.set("isGenerator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsGenerator: Self = this.set("isGenerator", js.undefined)
  }
  
}


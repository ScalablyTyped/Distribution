package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about the data source for the element containing it.
  */
@js.native
trait SchemaSource extends js.Object {
  /**
    * The name of the data source.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether this data comes from an official government source.
    */
  var official: js.UndefOr[Boolean] = js.native
}

object SchemaSource {
  @scala.inline
  def apply(): SchemaSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSource]
  }
  @scala.inline
  implicit class SchemaSourceOps[Self <: SchemaSource] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOfficial(value: Boolean): Self = this.set("official", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfficial: Self = this.set("official", js.undefined)
  }
  
}


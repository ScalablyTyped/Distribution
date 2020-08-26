package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a reference to a resource.
  */
@js.native
trait SchemaReference extends js.Object {
  /**
    * [Output Only] Type of the resource. Always compute#reference for
    * references.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A description of the reference type with no implied semantics. Possible
    * values include:   - MEMBER_OF
    */
  var referenceType: js.UndefOr[String] = js.native
  /**
    * URL of the resource which refers to the target.
    */
  var referrer: js.UndefOr[String] = js.native
  /**
    * URL of the resource to which this reference points.
    */
  var target: js.UndefOr[String] = js.native
}

object SchemaReference {
  @scala.inline
  def apply(): SchemaReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReference]
  }
  @scala.inline
  implicit class SchemaReferenceOps[Self <: SchemaReference] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setReferenceType(value: String): Self = this.set("referenceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceType: Self = this.set("referenceType", js.undefined)
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}


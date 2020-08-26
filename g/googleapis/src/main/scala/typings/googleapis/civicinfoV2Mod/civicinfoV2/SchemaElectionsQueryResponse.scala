package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The list of elections available for this version of the API.
  */
@js.native
trait SchemaElectionsQueryResponse extends js.Object {
  /**
    * A list of available elections
    */
  var elections: js.UndefOr[js.Array[SchemaElection]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;civicinfo#electionsQueryResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaElectionsQueryResponse {
  @scala.inline
  def apply(): SchemaElectionsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaElectionsQueryResponse]
  }
  @scala.inline
  implicit class SchemaElectionsQueryResponseOps[Self <: SchemaElectionsQueryResponse] (val x: Self) extends AnyVal {
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
    def setElectionsVarargs(value: SchemaElection*): Self = this.set("elections", js.Array(value :_*))
    @scala.inline
    def setElections(value: js.Array[SchemaElection]): Self = this.set("elections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElections: Self = this.set("elections", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}


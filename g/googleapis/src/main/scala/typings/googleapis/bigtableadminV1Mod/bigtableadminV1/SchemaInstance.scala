package typings.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of Bigtable Tables and the resources that serve them. All
  * tables in an instance are served from all Clusters in the instance.
  */
@js.native
trait SchemaInstance extends js.Object {
  /**
    * The descriptive name for this instance as it appears in UIs. Can be
    * changed at any time, but should be kept globally unique to avoid
    * confusion.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Labels are a flexible and lightweight mechanism for organizing cloud
    * resources into groups that reflect a customer&#39;s organizational needs
    * and deployment strategies. They can be used to filter resources and
    * aggregate metrics.  * Label keys must be between 1 and 63 characters long
    * and must conform to   the regular expression: `\p{Ll}\p{Lo}{0,62}`. *
    * Label values must be between 0 and 63 characters long and must conform to
    * the regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`. * No more than 64
    * labels can be associated with a given resource. * Keys and values must
    * both be under 128 bytes.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * (`OutputOnly`) The unique name of the instance. Values are of the form
    * `projects/&lt;project&gt;/instances/a-z+[a-z0-9]`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * (`OutputOnly`) The current state of the instance.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The type of the instance. Defaults to `PRODUCTION`.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaInstance {
  @scala.inline
  def apply(
    displayName: String = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    state: String = null,
    `type`: String = null
  ): SchemaInstance = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstance]
  }
}


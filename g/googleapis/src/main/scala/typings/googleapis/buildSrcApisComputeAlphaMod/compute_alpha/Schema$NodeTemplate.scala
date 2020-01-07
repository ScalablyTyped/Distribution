package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Node Template resource.
  */
@js.native
trait Schema$NodeTemplate extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] The type of the resource. Always compute#nodeTemplate for
    * node templates.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the resource, provided by the client when initially creating
    * the resource. The resource name must be 1-63 characters long, and comply
    * with RFC1035. Specifically, the name must be 1-63 characters long and
    * match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the
    * first character must be a lowercase letter, and all following characters
    * must be a dash, lowercase letter, or digit, except the last character,
    * which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Labels to use for node affinity, which will be used in instance
    * scheduling.
    */
  var nodeAffinityLabels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The node type to use for nodes group that are created from this template.
    */
  var nodeType: js.UndefOr[String] = js.native
  /**
    * The flexible properties of the desired node type. Node groups that use
    * this node template will create nodes of a type that matches these
    * properties.  This field is mutually exclusive with the node_type
    * property; you can only define one or the other, but not both.
    */
  var nodeTypeFlexibility: js.UndefOr[Schema$NodeTemplateNodeTypeFlexibility] = js.native
  /**
    * [Output Only] The name of the region where the node template resides,
    * such as us-central1.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * Binding properties for the physical server.
    */
  var serverBinding: js.UndefOr[Schema$ServerBinding] = js.native
  /**
    * [Output Only] The status of the node template. One of the following
    * values: CREATING, READY, and DELETING.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * [Output Only] An optional, human-readable explanation of the status.
    */
  var statusMessage: js.UndefOr[String] = js.native
}

object Schema$NodeTemplate {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    nodeAffinityLabels: StringDictionary[String] = null,
    nodeType: String = null,
    nodeTypeFlexibility: Schema$NodeTemplateNodeTypeFlexibility = null,
    region: String = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    serverBinding: Schema$ServerBinding = null,
    status: String = null,
    statusMessage: String = null
  ): Schema$NodeTemplate = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodeAffinityLabels != null) __obj.updateDynamic("nodeAffinityLabels")(nodeAffinityLabels.asInstanceOf[js.Any])
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType.asInstanceOf[js.Any])
    if (nodeTypeFlexibility != null) __obj.updateDynamic("nodeTypeFlexibility")(nodeTypeFlexibility.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (serverBinding != null) __obj.updateDynamic("serverBinding")(serverBinding.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NodeTemplate]
  }
}


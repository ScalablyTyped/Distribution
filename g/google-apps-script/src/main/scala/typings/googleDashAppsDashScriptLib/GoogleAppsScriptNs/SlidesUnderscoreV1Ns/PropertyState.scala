package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertyState extends js.Object

//// FILE: properties.proto ////
// The possible states of a property.
@JSGlobal("GoogleAppsScript.Slides_v1.PropertyState")
@js.native
object PropertyState extends js.Object {
  // If a property's state is INHERIT, then the property state uses the value of
  // corresponding `property_state` field on the parent shape. Elements that do
  // not inherit will never have an INHERIT property state.
  @js.native
  sealed trait INHERIT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PropertyState
  
  // If a property's state is NOT_RENDERED, then the element does not have the
  // corresponding property when rendered on a page. However, the field may
  // still be set so it can be inherited by child shapes. To remove a property
  // from a rendered element, set its property_state to NOT_RENDERED.
  @js.native
  sealed trait NOT_RENDERED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PropertyState
  
  // If a property's state is RENDERED, then the element has the corresponding
  // property when rendered on a page. If the element is a placeholder shape as
  // determined by the placeholder
  // field, and it inherits from a placeholder shape, the corresponding field
  // may be unset, meaning that the property value is inherited from a parent
  // placeholder. If the element does not inherit, then the field will contain
  // the rendered value. This is the default value.
  @js.native
  sealed trait RENDERED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PropertyState
  
  val INHERIT: INHERIT with java.lang.String = js.native
  val NOT_RENDERED: NOT_RENDERED with java.lang.String = js.native
  val RENDERED: RENDERED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PropertyState with java.lang.String
  ] = js.native
}


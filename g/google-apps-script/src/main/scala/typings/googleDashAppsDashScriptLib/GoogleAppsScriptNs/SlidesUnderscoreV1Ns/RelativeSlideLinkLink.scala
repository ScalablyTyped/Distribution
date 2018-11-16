package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelativeSlideLinkLink extends js.Object

// The kinds of relative links.
@JSGlobal("GoogleAppsScript.Slides_v1.RelativeSlideLinkLink")
@js.native
object RelativeSlideLinkLink extends js.Object {
  // A link to the first slide in the presentation.
  @js.native
  sealed trait FIRST_SLIDE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.RelativeSlideLinkLink
  
  // A link to the last slide in the presentation.
  @js.native
  sealed trait LAST_SLIDE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.RelativeSlideLinkLink
  
  // A link to the next slide.
  @js.native
  sealed trait NEXT_SLIDE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.RelativeSlideLinkLink
  
  // A link to the previous slide.
  @js.native
  sealed trait PREVIOUS_SLIDE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.RelativeSlideLinkLink
  
  // An unspecified relative slide link.
  @js.native
  sealed trait RELATIVE_SLIDE_LINK_UNSPECIFIED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.RelativeSlideLinkLink
  
  val FIRST_SLIDE: FIRST_SLIDE with java.lang.String = js.native
  val LAST_SLIDE: LAST_SLIDE with java.lang.String = js.native
  val NEXT_SLIDE: NEXT_SLIDE with java.lang.String = js.native
  val PREVIOUS_SLIDE: PREVIOUS_SLIDE with java.lang.String = js.native
  val RELATIVE_SLIDE_LINK_UNSPECIFIED: RELATIVE_SLIDE_LINK_UNSPECIFIED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.RelativeSlideLinkLink with java.lang.String
  ] = js.native
}


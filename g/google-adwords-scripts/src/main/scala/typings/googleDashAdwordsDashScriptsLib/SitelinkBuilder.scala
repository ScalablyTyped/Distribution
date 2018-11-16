package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SitelinkBuilder[Sitelink]
  extends AdWordsBuilder[Sitelink]
     with hasMobilePreferredBuilder[SitelinkBuilder[Sitelink]]
     with hasStartAndEndDateBuilder[SitelinkBuilder[Sitelink]]
     with hasSchedulesBuilder[SitelinkBuilder[Sitelink]]
     with hasTrackingTemplateBuilder[SitelinkBuilder[Sitelink]]
     with hasFinalUrlBuilder[SitelinkBuilder[Sitelink]] {
  def withDescription1(description1: java.lang.String): SitelinkBuilder[Sitelink] = js.native
  def withDescription2(description2: java.lang.String): SitelinkBuilder[Sitelink] = js.native
  def withLinkText(linkText: java.lang.String): SitelinkBuilder[Sitelink] = js.native
}


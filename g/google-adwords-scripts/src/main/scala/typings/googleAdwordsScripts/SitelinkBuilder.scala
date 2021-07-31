package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SitelinkBuilder[Sitelink]
  extends StObject
     with AdWordsBuilder[Sitelink]
     with hasMobilePreferredBuilder[SitelinkBuilder[Sitelink]]
     with hasStartAndEndDateBuilder[SitelinkBuilder[Sitelink]]
     with hasSchedulesBuilder[SitelinkBuilder[Sitelink]]
     with hasTrackingTemplateBuilder[SitelinkBuilder[Sitelink]]
     with hasFinalUrlBuilder[SitelinkBuilder[Sitelink]] {
  
  def withDescription1(description1: String): SitelinkBuilder[Sitelink] = js.native
  
  def withDescription2(description2: String): SitelinkBuilder[Sitelink] = js.native
  
  def withLinkText(linkText: String): SitelinkBuilder[Sitelink] = js.native
}

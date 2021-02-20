package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Key images associated with this report
  */
@js.native
trait DiagnosticReportImage extends BackboneElement {
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  
  /**
    * Comment about the image (e.g. explanation)
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Reference to the image source
    */
  var link: Reference = js.native
}
object DiagnosticReportImage {
  
  @scala.inline
  def apply(link: Reference): DiagnosticReportImage = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticReportImage]
  }
  
  @scala.inline
  implicit class DiagnosticReportImageMutableBuilder[Self <: DiagnosticReportImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setLink(value: Reference): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
  }
}

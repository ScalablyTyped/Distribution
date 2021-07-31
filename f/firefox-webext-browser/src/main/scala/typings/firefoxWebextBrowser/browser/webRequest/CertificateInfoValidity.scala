package typings.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains start and end timestamps. */
trait CertificateInfoValidity extends StObject {
  
  var end: Double
  
  var start: Double
}
object CertificateInfoValidity {
  
  @scala.inline
  def apply(end: Double, start: Double): CertificateInfoValidity = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfoValidity]
  }
  
  @scala.inline
  implicit class CertificateInfoValidityMutableBuilder[Self <: CertificateInfoValidity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}

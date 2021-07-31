package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resumable extends StObject {
  
  var resumable: js.UndefOr[Multipart] = js.undefined
  
  var simple: js.UndefOr[Multipart] = js.undefined
}
object Resumable {
  
  @scala.inline
  def apply(): Resumable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resumable]
  }
  
  @scala.inline
  implicit class ResumableMutableBuilder[Self <: Resumable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResumable(value: Multipart): Self = StObject.set(x, "resumable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumableUndefined: Self = StObject.set(x, "resumable", js.undefined)
    
    @scala.inline
    def setSimple(value: Multipart): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
  }
}

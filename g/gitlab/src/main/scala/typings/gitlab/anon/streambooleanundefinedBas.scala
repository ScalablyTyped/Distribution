package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  stream :boolean | undefined} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
@js.native
trait streambooleanundefinedBas
  extends /* key */ StringDictionary[js.Any] {
  
  var stream: js.UndefOr[Boolean] = js.native
  
  var sudo: js.UndefOr[String | Double] = js.native
}
object streambooleanundefinedBas {
  
  @scala.inline
  def apply(): streambooleanundefinedBas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[streambooleanundefinedBas]
  }
  
  @scala.inline
  implicit class streambooleanundefinedBasMutableBuilder[Self <: streambooleanundefinedBas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}

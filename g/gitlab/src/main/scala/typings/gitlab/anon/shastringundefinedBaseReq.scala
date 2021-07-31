package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  sha :string | undefined} & gitlab.gitlab/dist/types/core/infrastructure.BaseRequestOptions */
trait shastringundefinedBaseReq
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var sha: js.UndefOr[String] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object shastringundefinedBaseReq {
  
  @scala.inline
  def apply(): shastringundefinedBaseReq = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[shastringundefinedBaseReq]
  }
  
  @scala.inline
  implicit class shastringundefinedBaseReqMutableBuilder[Self <: shastringundefinedBaseReq] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}

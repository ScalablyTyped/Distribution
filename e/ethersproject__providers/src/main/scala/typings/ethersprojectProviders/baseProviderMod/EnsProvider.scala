package typings.ethersprojectProviders.baseProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnsProvider extends js.Object {
  
  def getResolver(name: String): js.Promise[EnsResolver] = js.native
  
  def lookupAddress(address: String): js.Promise[String] = js.native
  
  def resolveName(name: String): js.Promise[String] = js.native
}
object EnsProvider {
  
  @scala.inline
  def apply(
    getResolver: String => js.Promise[EnsResolver],
    lookupAddress: String => js.Promise[String],
    resolveName: String => js.Promise[String]
  ): EnsProvider = {
    val __obj = js.Dynamic.literal(getResolver = js.Any.fromFunction1(getResolver), lookupAddress = js.Any.fromFunction1(lookupAddress), resolveName = js.Any.fromFunction1(resolveName))
    __obj.asInstanceOf[EnsProvider]
  }
  
  @scala.inline
  implicit class EnsProviderOps[Self <: EnsProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetResolver(value: String => js.Promise[EnsResolver]): Self = this.set("getResolver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLookupAddress(value: String => js.Promise[String]): Self = this.set("lookupAddress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolveName(value: String => js.Promise[String]): Self = this.set("resolveName", js.Any.fromFunction1(value))
  }
}

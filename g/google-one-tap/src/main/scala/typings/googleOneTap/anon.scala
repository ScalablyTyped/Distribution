package typings.googleOneTap

import typings.googleOneTap.mod.IdConfiguration
import typings.googleOneTap.mod.PromptMomentNotification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Cancel extends js.Object {
    
    def cancel(): Unit = js.native
    
    def disableAutoSelect(): Unit = js.native
    
    def initialize(idConfiguration: IdConfiguration): Unit = js.native
    
    def onGoogleLibraryLoad(): Unit = js.native
    
    def prompt(): Unit = js.native
    def prompt(momentListener: js.Function1[/* promptMomentNotification */ PromptMomentNotification, Unit]): Unit = js.native
    
    def storeCredential(): Unit = js.native
    def storeCredential(credential: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
    def storeCredential(credential: String): Unit = js.native
    def storeCredential(credential: String, callback: js.Function0[Unit]): Unit = js.native
  }
}

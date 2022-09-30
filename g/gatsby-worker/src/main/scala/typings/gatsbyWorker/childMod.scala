package typings.gatsbyWorker

import typings.gatsbyWorker.gatsbyWorkerInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object childMod {
  
  @JSImport("gatsby-worker/dist/child", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gatsby-worker/dist/child", "getMessenger")
  @js.native
  def getMessenger: js.Function0[js.UndefOr[IGatsbyWorkerMessenger[Any, Any]]] = js.native
  inline def getMessenger_=(x: js.Function0[js.UndefOr[IGatsbyWorkerMessenger[Any, Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getMessenger")(x.asInstanceOf[js.Any])
  
  /**
    * Used to check wether current context is executed in worker process
    */
  @JSImport("gatsby-worker/dist/child", "isWorker")
  @js.native
  def isWorker: Boolean = js.native
  inline def isWorker_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isWorker")(x.asInstanceOf[js.Any])
  
  trait IGatsbyWorkerMessenger[MessagesFromParent, MessagesFromChild] extends StObject {
    
    var messagingVersion: `1`
    
    def onMessage(listener: js.Function1[/* msg */ MessagesFromParent, Unit]): Unit
    
    def sendMessage(msg: MessagesFromChild): Unit
  }
  object IGatsbyWorkerMessenger {
    
    inline def apply[MessagesFromParent, MessagesFromChild](
      onMessage: js.Function1[/* msg */ MessagesFromParent, Unit] => Unit,
      sendMessage: MessagesFromChild => Unit
    ): IGatsbyWorkerMessenger[MessagesFromParent, MessagesFromChild] = {
      val __obj = js.Dynamic.literal(messagingVersion = 1, onMessage = js.Any.fromFunction1(onMessage), sendMessage = js.Any.fromFunction1(sendMessage))
      __obj.asInstanceOf[IGatsbyWorkerMessenger[MessagesFromParent, MessagesFromChild]]
    }
    
    extension [Self <: IGatsbyWorkerMessenger[?, ?], MessagesFromParent, MessagesFromChild](x: Self & (IGatsbyWorkerMessenger[MessagesFromParent, MessagesFromChild])) {
      
      inline def setMessagingVersion(value: `1`): Self = StObject.set(x, "messagingVersion", value.asInstanceOf[js.Any])
      
      inline def setOnMessage(value: js.Function1[/* msg */ MessagesFromParent, Unit] => Unit): Self = StObject.set(x, "onMessage", js.Any.fromFunction1(value))
      
      inline def setSendMessage(value: MessagesFromChild => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction1(value))
    }
  }
}

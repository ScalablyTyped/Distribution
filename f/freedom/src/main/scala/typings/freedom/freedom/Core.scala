package typings.freedom.freedom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// See |Core_unprivileged| in |core.unprivileged.js|
trait Core extends StObject {
  
  // Given an ChannelEndpointIdentifier for a channel, create a proxy event
  // interface for it.
  def bindChannel(channelIdentifier: String): js.Promise[Channel]
  
  // Create a new channel which which to communicate between modules.
  def createChannel(): js.Promise[ChannelSpecifier]
  
  // Returns the list of identifiers describing the dependency path.
  def getId(): js.Promise[js.Array[String]]
  
  def getLogger(tag: String): js.Promise[Logger]
}
object Core {
  
  inline def apply(
    bindChannel: String => js.Promise[Channel],
    createChannel: () => js.Promise[ChannelSpecifier],
    getId: () => js.Promise[js.Array[String]],
    getLogger: String => js.Promise[Logger]
  ): Core = {
    val __obj = js.Dynamic.literal(bindChannel = js.Any.fromFunction1(bindChannel), createChannel = js.Any.fromFunction0(createChannel), getId = js.Any.fromFunction0(getId), getLogger = js.Any.fromFunction1(getLogger))
    __obj.asInstanceOf[Core]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Core] (val x: Self) extends AnyVal {
    
    inline def setBindChannel(value: String => js.Promise[Channel]): Self = StObject.set(x, "bindChannel", js.Any.fromFunction1(value))
    
    inline def setCreateChannel(value: () => js.Promise[ChannelSpecifier]): Self = StObject.set(x, "createChannel", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetLogger(value: String => js.Promise[Logger]): Self = StObject.set(x, "getLogger", js.Any.fromFunction1(value))
  }
}

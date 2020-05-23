package typings.firebaseFirestore.streamTestMod

import typings.firebaseFirestore.asyncQueueMod.AsyncQueue
import typings.firebaseFirestore.credentialsMod.EmptyCredentialsProvider
import typings.firebaseFirestore.persistentStreamMod.PersistentWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/test/integration/remote/stream.test", "withTestWriteStream")
@js.native
object withTestWriteStream extends js.Object {
  def apply(
    fn: js.Function3[
      /* writeStream */ PersistentWriteStream, 
      /* streamListener */ StreamStatusListener, 
      /* queue */ AsyncQueue, 
      js.Promise[Unit]
    ]
  ): js.Promise[Unit] = js.native
  def apply(
    fn: js.Function3[
      /* writeStream */ PersistentWriteStream, 
      /* streamListener */ StreamStatusListener, 
      /* queue */ AsyncQueue, 
      js.Promise[Unit]
    ],
    credentialsProvider: EmptyCredentialsProvider
  ): js.Promise[Unit] = js.native
}


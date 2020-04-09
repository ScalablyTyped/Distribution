package typings.firebaseFirestore.persistenceMod

import typings.firebaseFirestore.localStoreMod.LocalStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GarbageCollectionScheduler extends js.Object {
  val started: Boolean
  def start(localStore: LocalStore): Unit
  def stop(): Unit
}

object GarbageCollectionScheduler {
  @scala.inline
  def apply(start: LocalStore => Unit, started: Boolean, stop: () => Unit): GarbageCollectionScheduler = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction1(start), started = started.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[GarbageCollectionScheduler]
  }
}


package typings.feedsub.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedSub extends TypedEventEmitter[FeedSubEvents] {
  
  /**
    * Options that were passed to the constructor along with any defaults are kept here.
    */
  var options: FeedSubOptions = js.native
  
  /**
    * Reads the feed. Calls callback with possible error or new items discovered if provided.
    * Causes reader to emit new item events.
    * @param callback The function to call.
    */
  def read(): Unit = js.native
  def read(callback: js.Function2[/* err */ Error | Null, /* items */ js.UndefOr[js.Array[FeedItem]], Unit]): Unit = js.native
  
  /**
    * Starts checking the feed for any new items.
    * It checks right away, and then, every options.interval minutes.
    */
  def start(): Unit = js.native
  
  /**
    * Stops the reader from automatically reading the feed.
    */
  def stop(): Unit = js.native
}

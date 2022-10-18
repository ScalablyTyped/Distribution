package typings.esfxCanceltoken

import typings.esfxCanceltoken.esfxCanceltokenStrings.abort
import typings.esfxCanceltoken.esfxCanceltokenStrings.error
import typings.esfxCanceltoken.esfxCanceltokenStrings.load
import typings.esfxCanceltoken.esfxCanceltokenStrings.loadend
import typings.esfxCanceltoken.esfxCanceltokenStrings.loadstart
import typings.esfxCanceltoken.esfxCanceltokenStrings.progress
import typings.esfxCanceltoken.esfxCanceltokenStrings.readystatechange
import typings.esfxCanceltoken.esfxCanceltokenStrings.timeout
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.ProgressEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLHttpRequest extends StObject {
  
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def addEventListener(
    `type`: String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: abort,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: error,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: load,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(
    `type`: loadend,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(
    `type`: loadstart,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(
    `type`: progress,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(`type`: readystatechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readystatechange(
    `type`: readystatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeout(
    `type`: timeout,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeout(
    `type`: timeout,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeout(
    `type`: timeout,
    listener: js.ThisFunction1[
      /* this */ this.type, 
      /* ev */ ProgressEvent[typings.std.XMLHttpRequestEventTarget], 
      Any
    ],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
}

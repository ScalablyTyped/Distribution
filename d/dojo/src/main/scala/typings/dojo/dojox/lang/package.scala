package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lang {
  type async = typings.dojo.dojox.lang.async_
  type functional = typings.dojo.dojox.lang.functional_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/lang/observable.html
    *
    * Creates a wrapper object, which can be observed. The wrapper object
    * is a proxy to the wrapped object. If you will be making multiple wrapper
    * objects with the same set of listeners, it is recommended that you
    * use makeObservable, as it is more memory efficient.
    *
    * @param wrapped The object to be wrapped and monitored for property access and modification
    * @param onRead See dojox.lang.makeObservable.onRead
    * @param onWrite See dojox.lang.makeObservable.onWrite
    * @param onInvoke See dojox.lang.makeObservable.onInvoke
    */
  type observable = js.Function4[
    /* wrapped */ js.Object, 
    /* onRead */ js.Function, 
    /* onWrite */ js.Function, 
    /* onInvoke */ js.Function, 
    scala.Unit
  ]
}

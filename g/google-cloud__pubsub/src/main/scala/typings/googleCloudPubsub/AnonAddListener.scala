package typings.googleCloudPubsub

import typings.googleCloudPubsub.googleCloudPubsubStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddListener[O] extends js.Object {
  @JSName("addListener")
  def addListener_data(event: data, listener: js.Function1[/* data */ O, Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object
  @JSName("emit")
  def emit_data(event: data, data: O): Boolean
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* data */ O, Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* data */ O, Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object
  @JSName("prependListener")
  def prependListener_data(event: data, listener: js.Function1[/* data */ O, Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: data, listener: js.Function1[/* data */ O, Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object
}

object AnonAddListener {
  @scala.inline
  def apply[O](
    addListener: (data, js.Function1[/* data */ O, Unit]) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object,
    emit: (data, O) => Boolean,
    on: (data, js.Function1[/* data */ O, Unit]) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object,
    once: (data, js.Function1[/* data */ O, Unit]) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object,
    prependListener: (data, js.Function1[/* data */ O, Unit]) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object,
    prependOnceListener: (data, js.Function1[/* data */ O, Unit]) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object
  ): AnonAddListener[O] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), prependListener = js.Any.fromFunction2(prependListener), prependOnceListener = js.Any.fromFunction2(prependOnceListener))
  
    __obj.asInstanceOf[AnonAddListener[O]]
  }
}


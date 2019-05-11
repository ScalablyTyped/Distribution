package typings
package atGoogleDashCloudPubsubLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddListener[O] extends js.Object {
  @JSName("addListener")
  def addListener_data(
    event: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.data,
    listener: js.Function1[/* data */ O, scala.Unit]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object
  @JSName("emit")
  def emit_data(event: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.data, data: O): scala.Boolean
  @JSName("on")
  def on_data(
    event: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.data,
    listener: js.Function1[/* data */ O, scala.Unit]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object
  @JSName("once")
  def once_data(
    event: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.data,
    listener: js.Function1[/* data */ O, scala.Unit]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object
  @JSName("prependListener")
  def prependListener_data(
    event: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.data,
    listener: js.Function1[/* data */ O, scala.Unit]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object
  @JSName("prependOnceListener")
  def prependOnceListener_data(
    event: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.data,
    listener: js.Function1[/* data */ O, scala.Unit]
  ): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object
}

object Anon_AddListener {
  @scala.inline
  def apply[O](
    addListener_data: (atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.data, js.Function1[/* data */ O, scala.Unit]) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object,
    emit_data: (atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.data, O) => scala.Boolean,
    on_data: (atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.data, js.Function1[/* data */ O, scala.Unit]) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object,
    once_data: (atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.data, js.Function1[/* data */ O, scala.Unit]) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object,
    prependListener_data: (atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.data, js.Function1[/* data */ O, scala.Unit]) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object,
    prependOnceListener_data: (atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubLibStrings.data, js.Function1[/* data */ O, scala.Unit]) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/pubsub.@google-cloud/pubsub/build/src/pubsub.ObjectStream<O> */ js.Object
  ): Anon_AddListener[O] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction2(addListener_data))
    __obj.updateDynamic("emit")(js.Any.fromFunction2(emit_data))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_data))
    __obj.updateDynamic("once")(js.Any.fromFunction2(once_data))
    __obj.updateDynamic("prependListener")(js.Any.fromFunction2(prependListener_data))
    __obj.updateDynamic("prependOnceListener")(js.Any.fromFunction2(prependOnceListener_data))
    __obj.asInstanceOf[Anon_AddListener[O]]
  }
}


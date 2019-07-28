package typings.atGoogleDashCloudPaginator

import typings.atGoogleDashCloudPaginator.atGoogleDashCloudPaginatorStrings.data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddListener[T] extends js.Object {
  @JSName("addListener")
  def addListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/paginator.@google-cloud/paginator.ResourceStream<T> */ js.Object
  @JSName("emit")
  def emit_data(event: data, data: T): Boolean
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* data */ T, Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/paginator.@google-cloud/paginator.ResourceStream<T> */ js.Object
  @JSName("once")
  def once_data(event: data, listener: js.Function1[/* data */ T, Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/paginator.@google-cloud/paginator.ResourceStream<T> */ js.Object
  @JSName("prependListener")
  def prependListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/paginator.@google-cloud/paginator.ResourceStream<T> */ js.Object
  @JSName("prependOnceListener")
  def prependOnceListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/paginator.@google-cloud/paginator.ResourceStream<T> */ js.Object
  @JSName("removeListener")
  def removeListener_data(event: data, listener: js.Function1[/* data */ T, Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/paginator.@google-cloud/paginator.ResourceStream<T> */ js.Object
}

object Anon_AddListener {
  @scala.inline
  def apply[T](
    addListener_data: (data, js.Function1[/* data */ T, Unit]) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/paginator.@google-cloud/paginator.ResourceStream<T> */ js.Object,
    emit_data: (data, T) => Boolean,
    on_data: (data, js.Function1[/* data */ T, Unit]) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/paginator.@google-cloud/paginator.ResourceStream<T> */ js.Object,
    once_data: (data, js.Function1[/* data */ T, Unit]) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/paginator.@google-cloud/paginator.ResourceStream<T> */ js.Object,
    prependListener_data: (data, js.Function1[/* data */ T, Unit]) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/paginator.@google-cloud/paginator.ResourceStream<T> */ js.Object,
    prependOnceListener_data: (data, js.Function1[/* data */ T, Unit]) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/paginator.@google-cloud/paginator.ResourceStream<T> */ js.Object,
    removeListener_data: (data, js.Function1[/* data */ T, Unit]) => /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @google-cloud/paginator.@google-cloud/paginator.ResourceStream<T> */ js.Object
  ): Anon_AddListener[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction2(addListener_data))
    __obj.updateDynamic("emit")(js.Any.fromFunction2(emit_data))
    __obj.updateDynamic("on")(js.Any.fromFunction2(on_data))
    __obj.updateDynamic("once")(js.Any.fromFunction2(once_data))
    __obj.updateDynamic("prependListener")(js.Any.fromFunction2(prependListener_data))
    __obj.updateDynamic("prependOnceListener")(js.Any.fromFunction2(prependOnceListener_data))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction2(removeListener_data))
    __obj.asInstanceOf[Anon_AddListener[T]]
  }
}


package typings.elasticlunr.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerialisedDocumentStore[T] extends js.Object {
  var docInfo: StringDictionary[
    typings.elasticlunr.elasticlunrStrings.SerialisedDocumentStore with TopLevel[js.Any]
  ] = js.native
  var docs: StringDictionary[T] = js.native
}

object SerialisedDocumentStore {
  @scala.inline
  def apply[T](
    docInfo: StringDictionary[
      typings.elasticlunr.elasticlunrStrings.SerialisedDocumentStore with TopLevel[js.Any]
    ],
    docs: StringDictionary[T]
  ): SerialisedDocumentStore[T] = {
    val __obj = js.Dynamic.literal(docInfo = docInfo.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialisedDocumentStore[T]]
  }
  @scala.inline
  implicit class SerialisedDocumentStoreOps[Self <: SerialisedDocumentStore[_], T] (val x: Self with SerialisedDocumentStore[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocInfo(
      value: StringDictionary[
          typings.elasticlunr.elasticlunrStrings.SerialisedDocumentStore with TopLevel[js.Any]
        ]
    ): Self = this.set("docInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocs(value: StringDictionary[T]): Self = this.set("docs", value.asInstanceOf[js.Any])
  }
  
}


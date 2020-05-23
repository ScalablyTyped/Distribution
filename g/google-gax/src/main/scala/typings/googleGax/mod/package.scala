package typings.googleGax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[ResponseObject, NextRequestObject, RawResponseObject] = js.Function4[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* value */ js.UndefOr[ResponseObject | scala.Null], 
    /* nextRequest */ js.UndefOr[NextRequestObject], 
    /* rawResponse */ js.UndefOr[RawResponseObject], 
    scala.Unit
  ]
  type PaginationCallback[RequestObject, ResponseObject, ResponseType] = js.Function4[
    /* err */ typings.std.Error | scala.Null, 
    /* values */ js.UndefOr[js.Array[ResponseType]], 
    /* nextPageRequest */ js.UndefOr[RequestObject], 
    /* rawResponse */ js.UndefOr[ResponseObject], 
    scala.Unit
  ]
}

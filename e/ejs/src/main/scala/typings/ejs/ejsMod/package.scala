package typings.ejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ejsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.ejs.Anon_ToString
  import typings.std.Error

  type AsyncClientFunction = js.Function4[
    /* locals */ js.UndefOr[Data], 
    /* escape */ js.UndefOr[EscapeCallback], 
    /* include */ js.UndefOr[IncludeCallback], 
    /* rethrow */ js.UndefOr[RethrowCallback], 
    js.Promise[String]
  ]
  type AsyncTemplateFunction = js.Function1[/* data */ js.UndefOr[Data], js.Promise[String]]
  type ClientFunction = js.Function4[
    /* locals */ js.UndefOr[Data], 
    /* escape */ js.UndefOr[EscapeCallback], 
    /* include */ js.UndefOr[IncludeCallback], 
    /* rethrow */ js.UndefOr[RethrowCallback], 
    String
  ]
  type Data = StringDictionary[js.Any]
  type EscapeCallback = js.Function1[/* markup */ js.UndefOr[js.Any], String]
  type IncludeCallback = js.Function2[/* path */ String, /* data */ js.UndefOr[Data], String]
  type RenderFileCallback[T] = js.Function2[/* err */ Error | Null, /* str */ String, T]
  type RethrowCallback = js.Function5[
    /* err */ Error, 
    /* str */ String, 
    /* filename */ js.UndefOr[String | Null], 
    /* lineno */ Double, 
    /* esc */ EscapeCallback, 
    scala.Nothing
  ]
  type TemplateFunction = js.Function1[/* data */ js.UndefOr[Data], String]
  type fileLoader = js.Function1[/* path */ String, String | Anon_ToString]
}

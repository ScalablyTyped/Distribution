package typings
package fastifyDashAcceptsLib.fastifyDashAcceptsMod.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastifyRequest[HttpRequest] extends js.Object {
  var charset: js.Function0[js.Array[java.lang.String]] | (js.Function1[
    /* charsets */ js.Array[java.lang.String], 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */ java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var charsets: js.Function0[js.Array[java.lang.String]] | (js.Function1[
    /* charsets */ js.Array[java.lang.String], 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */ java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var encoding: js.Function0[js.Array[java.lang.String]] | (js.Function1[
    /* encodings */ js.Array[java.lang.String], 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */ java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var encodings: js.Function0[js.Array[java.lang.String]] | (js.Function1[
    /* charsets */ js.Array[java.lang.String], 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */ java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var language: js.Function0[js.Array[java.lang.String]] | (js.Function1[
    /* languages */ js.Array[java.lang.String], 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */ java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var languages: js.Function0[js.Array[java.lang.String]] | (js.Function1[
    /* languages */ js.Array[java.lang.String], 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */ java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var `type`: (js.Function1[
    /* types */ js.Array[java.lang.String], 
    js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */ java.lang.String, 
    js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var types: (js.Function1[
    /* types */ js.Array[java.lang.String], 
    js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */ java.lang.String, 
    js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  def accepts(): acceptsLib.acceptsMod.acceptsNs.Accepts
}

object FastifyRequest {
  @scala.inline
  def apply[HttpRequest](
    accepts: js.Function0[acceptsLib.acceptsMod.acceptsNs.Accepts],
    charset: js.Function0[js.Array[java.lang.String]] | (js.Function1[
      /* charsets */ js.Array[java.lang.String], 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]) | (js.Function1[
      /* repeated */ java.lang.String, 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]),
    charsets: js.Function0[js.Array[java.lang.String]] | (js.Function1[
      /* charsets */ js.Array[java.lang.String], 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]) | (js.Function1[
      /* repeated */ java.lang.String, 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]),
    encoding: js.Function0[js.Array[java.lang.String]] | (js.Function1[
      /* encodings */ js.Array[java.lang.String], 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]) | (js.Function1[
      /* repeated */ java.lang.String, 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]),
    encodings: js.Function0[js.Array[java.lang.String]] | (js.Function1[
      /* charsets */ js.Array[java.lang.String], 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]) | (js.Function1[
      /* repeated */ java.lang.String, 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]),
    language: js.Function0[js.Array[java.lang.String]] | (js.Function1[
      /* languages */ js.Array[java.lang.String], 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]) | (js.Function1[
      /* repeated */ java.lang.String, 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]),
    languages: js.Function0[js.Array[java.lang.String]] | (js.Function1[
      /* languages */ js.Array[java.lang.String], 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]) | (js.Function1[
      /* repeated */ java.lang.String, 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]),
    `type`: (js.Function1[
      /* types */ js.Array[java.lang.String], 
      js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]) | (js.Function1[
      /* repeated */ java.lang.String, 
      js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]),
    types: (js.Function1[
      /* types */ js.Array[java.lang.String], 
      js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]) | (js.Function1[
      /* repeated */ java.lang.String, 
      js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ])
  ): FastifyRequest[HttpRequest] = {
    val __obj = js.Dynamic.literal(accepts = accepts, charset = charset.asInstanceOf[js.Any], charsets = charsets.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], encodings = encodings.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastifyRequest[HttpRequest]]
  }
}


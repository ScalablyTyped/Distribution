package typings
package fastifyDashAcceptsLib.fastifyDashAcceptsMod.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastifyReply[HttpResponse] extends js.Object {
  var requestCharset: js.Function0[js.Array[java.lang.String]] | (js.Function1[
    /* charsets */ js.Array[java.lang.String], 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */ java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var requestCharsets: js.Function0[js.Array[java.lang.String]] | (js.Function1[
    /* charsets */ js.Array[java.lang.String], 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */ java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var requestEncoding: js.Function0[js.Array[java.lang.String]] | (js.Function1[
    /* encodings */ js.Array[java.lang.String], 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */ java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var requestEncodings: js.Function0[js.Array[java.lang.String]] | (js.Function1[
    /* charsets */ js.Array[java.lang.String], 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */ java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var requestLanguage: js.Function0[js.Array[java.lang.String]] | (js.Function1[
    /* languages */ js.Array[java.lang.String], 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */ java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var requestLanguages: js.Function0[js.Array[java.lang.String]] | (js.Function1[
    /* languages */ js.Array[java.lang.String], 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */ java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var requestType: (js.Function1[
    /* types */ js.Array[java.lang.String], 
    js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */ java.lang.String, 
    js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var requestTypes: (js.Function1[
    /* types */ js.Array[java.lang.String], 
    js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */ java.lang.String, 
    js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  def requestAccepts(): acceptsLib.acceptsMod.acceptsNs.Accepts
}

object FastifyReply {
  @scala.inline
  def apply[HttpResponse](
    requestAccepts: () => acceptsLib.acceptsMod.acceptsNs.Accepts,
    requestCharset: js.Function0[js.Array[java.lang.String]] | (js.Function1[
      /* charsets */ js.Array[java.lang.String], 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]) | (js.Function1[
      /* repeated */ java.lang.String, 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]),
    requestCharsets: js.Function0[js.Array[java.lang.String]] | (js.Function1[
      /* charsets */ js.Array[java.lang.String], 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]) | (js.Function1[
      /* repeated */ java.lang.String, 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]),
    requestEncoding: js.Function0[js.Array[java.lang.String]] | (js.Function1[
      /* encodings */ js.Array[java.lang.String], 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]) | (js.Function1[
      /* repeated */ java.lang.String, 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]),
    requestEncodings: js.Function0[js.Array[java.lang.String]] | (js.Function1[
      /* charsets */ js.Array[java.lang.String], 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]) | (js.Function1[
      /* repeated */ java.lang.String, 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]),
    requestLanguage: js.Function0[js.Array[java.lang.String]] | (js.Function1[
      /* languages */ js.Array[java.lang.String], 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]) | (js.Function1[
      /* repeated */ java.lang.String, 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]),
    requestLanguages: js.Function0[js.Array[java.lang.String]] | (js.Function1[
      /* languages */ js.Array[java.lang.String], 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]) | (js.Function1[
      /* repeated */ java.lang.String, 
      java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]),
    requestType: (js.Function1[
      /* types */ js.Array[java.lang.String], 
      js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]) | (js.Function1[
      /* repeated */ java.lang.String, 
      js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]),
    requestTypes: (js.Function1[
      /* types */ js.Array[java.lang.String], 
      js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ]) | (js.Function1[
      /* repeated */ java.lang.String, 
      js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
    ])
  ): FastifyReply[HttpResponse] = {
    val __obj = js.Dynamic.literal(requestAccepts = js.Any.fromFunction0(requestAccepts), requestCharset = requestCharset.asInstanceOf[js.Any], requestCharsets = requestCharsets.asInstanceOf[js.Any], requestEncoding = requestEncoding.asInstanceOf[js.Any], requestEncodings = requestEncodings.asInstanceOf[js.Any], requestLanguage = requestLanguage.asInstanceOf[js.Any], requestLanguages = requestLanguages.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], requestTypes = requestTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FastifyReply[HttpResponse]]
  }
}


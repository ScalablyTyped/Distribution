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
    /* repeated */java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var requestCharsets: js.Function0[js.Array[java.lang.String]] | (js.Function1[
    /* charsets */ js.Array[java.lang.String], 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var requestEncoding: js.Function0[js.Array[java.lang.String]] | (js.Function1[
    /* encodings */ js.Array[java.lang.String], 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var requestEncodings: js.Function0[js.Array[java.lang.String]] | (js.Function1[
    /* charsets */ js.Array[java.lang.String], 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var requestLanguage: js.Function0[js.Array[java.lang.String]] | (js.Function1[
    /* languages */ js.Array[java.lang.String], 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var requestLanguages: js.Function0[js.Array[java.lang.String]] | (js.Function1[
    /* languages */ js.Array[java.lang.String], 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */java.lang.String, 
    java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var requestType: (js.Function1[
    /* types */ js.Array[java.lang.String], 
    js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */java.lang.String, 
    js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  var requestTypes: (js.Function1[
    /* types */ js.Array[java.lang.String], 
    js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ]) | (js.Function1[
    /* repeated */java.lang.String, 
    js.Array[java.lang.String] | java.lang.String | fastifyDashAcceptsLib.fastifyDashAcceptsLibNumbers.`false`
  ])
  def requestAccepts(): acceptsLib.acceptsMod.acceptsNs.Accepts
}


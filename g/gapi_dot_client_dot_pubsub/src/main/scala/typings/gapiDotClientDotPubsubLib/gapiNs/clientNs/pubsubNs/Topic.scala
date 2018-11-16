package typings
package gapiDotClientDotPubsubLib.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Topic extends js.Object {
  /**
               * The name of the topic. It must have the format
               * `"projects/{project}/topics/{topic}"`. `{topic}` must start with a letter,
               * and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`),
               * underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent
               * signs (`%`). It must be between 3 and 255 characters in length, and it
               * must not start with `"goog"`.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
}


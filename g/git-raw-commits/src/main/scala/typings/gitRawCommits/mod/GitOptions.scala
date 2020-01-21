package typings.gitRawCommits.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Please check the available options at http://git-scm.com/docs/git-log.
  *
  * @remarks
  * Single dash arguments are not supported because of https://github.com/sindresorhus/dargs/blob/master/index.js#L5.
  *
  * @remarks
  * For `<revision range>` we can also use `<from>..<to>` pattern, and this
  * module has the following extra options for shortcut of this pattern:
  *
  * * `from`
  * * `to`
  *
  * This module also have the following additions:
  *
  * * `format`
  * * `debug`
  * * `path`
  */
trait GitOptions
  extends /* options */ StringDictionary[js.Any] {
  /**
    * A function to get debug information.
    */
  var debug: js.UndefOr[js.Function1[/* message */ js.Any, Unit]] = js.undefined
  /**
    * Please check http://git-scm.com/docs/git-log for format options.
    *
    * @default
    * '%B'
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * @default
    * ''
    */
  var from: js.UndefOr[String] = js.undefined
  /**
    * Filter commits to the path provided.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * @default
    * 'HEAD'
    */
  var to: js.UndefOr[String] = js.undefined
}

object GitOptions {
  @scala.inline
  def apply(
    StringDictionary: /* options */ StringDictionary[js.Any] = null,
    debug: /* message */ js.Any => Unit = null,
    format: String = null,
    from: String = null,
    path: String = null,
    to: String = null
  ): GitOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1(debug))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitOptions]
  }
}


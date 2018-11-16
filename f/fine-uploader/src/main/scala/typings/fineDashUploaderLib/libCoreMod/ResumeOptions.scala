package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ResumeOptions extends js.Object {
  /**
           * Define custom keys used to identify this file among other resume records.
           * 
           * The file's ID will be passed to your provided function
           * 
           * @default `function(fileId) { return [] }`
           */
  var customKeys: js.UndefOr[js.Function] = js.undefined
  /**
           * Enable or disable the ability to resume failed or stopped chunked uploads
           *
           * @default `false`
           */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * paramNames.resuming - Sent with the first request of the resume with a value of `true`.
           *
           * @default `'qqresume'`
           */
  var paramNames: js.UndefOr[ParamNamesOptions] = js.undefined
  /**
           * The number of days before a persistent resume record will expire
           *
           * @default `7`
           */
  var recordsExpireIn: js.UndefOr[scala.Double] = js.undefined
}


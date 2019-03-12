package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamsoftLib extends js.Object {
  /*ignored
    Addon_Events  Addon_Sendback_Events  AttachAndShowImage  BIO  DOM  DynamicLoadAddonFuns  DynamicWebTwain  EnumMouseButton
    Errors  Events  IntToColorStr  LS  OnGetImageByURL  OnGetImageFromServer  Path  ProgressBar  UI  Uri
    addEventListener  ajax  all  appendMessage  appendRichMessage  aryControlLoadImage  attachAddon  attachProperty
    base64  bio  cancelFrome  clearMessage  closeAll  closeProgress  colorStrToInt  config  css  currentStyle
    debug*/
  var detect: Anon_Ssl
  /*ignored
    detectButton  dialog  dialogShowStatus  dlgProgress  dlgRef  drawBoxBorder  drawImageWithHermite
    each  empty  endsWith
    */
  var env: Anon_BChrome
  def NewOCRReadPara(): OCRReadPara
  def NewOCRZone(): OCRZone
  def NewRedaction(): Redaction
  /*ignored
    error  escapeHtml  escapeRegExp  extend  filter  fireEvent  fromUnicode  get  getColor  getCss
    getElDimensions  getHex  getHexColor  getHttpUrl  getLogger  getOffset  getRandom  getRealPath  getScript
    getWS  getWSUrl  getWheelDelta  globalEval  guid  hide  html5  imageControlCount  indexOf  install
    io  isArray  isBoolean  isDef  isFunction  isLocalIP  isNaN  isNull  isNumber  isObject
    isPlainObject  isString  isUndef  isUndefined  isWindow  keys  log  main  makeArray  mix
    needShowTwiceShowDialog  nil  noop  now  obj  one  page  param  parse  parseHTML  parser
    product  progressMessage  ready  removeEventListener  replaceAll  replaceControl  show  showProgress  startWS
    startWSByIP  startsWith  stopPropagation  stringify  style  support  switchEvent  tmp  toggle  trim
    type  unEscapeHtml  unparam  upperCaseFirst  urlDecode  urlEncode  utf8  win
    ...other internal ones
    */
  def hideMask(): scala.Unit
  def showMask(): scala.Unit
}

object DynamsoftLib {
  @scala.inline
  def apply(
    NewOCRReadPara: () => OCRReadPara,
    NewOCRZone: () => OCRZone,
    NewRedaction: () => Redaction,
    detect: Anon_Ssl,
    env: Anon_BChrome,
    hideMask: () => scala.Unit,
    showMask: () => scala.Unit
  ): DynamsoftLib = {
    val __obj = js.Dynamic.literal(NewOCRReadPara = js.Any.fromFunction0(NewOCRReadPara), NewOCRZone = js.Any.fromFunction0(NewOCRZone), NewRedaction = js.Any.fromFunction0(NewRedaction), detect = detect, env = env, hideMask = js.Any.fromFunction0(hideMask), showMask = js.Any.fromFunction0(showMask))
  
    __obj.asInstanceOf[DynamsoftLib]
  }
}


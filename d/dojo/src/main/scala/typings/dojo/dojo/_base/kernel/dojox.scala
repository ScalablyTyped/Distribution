package typings.dojo.dojo._base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.dojox.html
  *
  *
  */
trait dojox extends js.Object {
  /**
    *
    */
  var BidiComplex: js.Object
  /**
    *
    */
  var analytics: js.Object
  /**
    *
    */
  var app: js.Object
  /**
    *
    */
  var atom: js.Object
  /**
    *
    */
  var av: js.Object
  /**
    *
    */
  var calc: js.Object
  /**
    *
    */
  var calendar: js.Object
  /**
    *
    */
  var charting: js.Object
  /**
    *
    */
  var collections: js.Object
  /**
    *
    */
  var color: js.Object
  /**
    *
    */
  var css3: js.Object
  /**
    *
    */
  var data: js.Object
  /**
    *
    */
  var date: js.Object
  /**
    *
    */
  var dgauges: js.Object
  /**
    *
    */
  var dnd: js.Object
  /**
    *
    */
  var drawing: js.Object
  /**
    *
    */
  var dtl: js.Object
  /**
    *
    */
  var editor: js.Object
  /**
    *
    */
  var embed: js.Object
  /**
    *
    */
  var encoding: js.Object
  /**
    *
    */
  var enhanced: js.Object
  /**
    * Utilities to embed and communicate with the Flash player from Javascript
    *
    */
  var flash: js.Object
  /**
    *
    */
  var form: js.Object
  /**
    *
    */
  var fx: js.Object
  /**
    *
    */
  var gantt: js.Object
  /**
    *
    */
  var gauges: js.Object
  /**
    *
    */
  var geo: js.Object
  /**
    *
    */
  var gesture: js.Object
  /**
    *
    */
  var gfx: js.Object
  /**
    *
    */
  var gfx3d: js.Object
  /**
    *
    */
  var grid: js.Object
  /**
    *
    */
  var help: js.Object
  /**
    *
    */
  var highlight: js.Object
  /**
    *
    */
  var html: js.Object
  /**
    *
    */
  var image: js.Object
  /**
    *
    */
  var io: js.Object
  /**
    *
    */
  var jq: js.Object
  /**
    *
    */
  var json: js.Object
  /**
    *
    */
  var jsonPath: js.Object
  /**
    *
    */
  var lang: js.Object
  /**
    *
    */
  var layout: js.Object
  /**
    *
    */
  var math: js.Object
  /**
    *
    */
  var mdnd: js.Object
  /**
    *
    */
  var mobile: js.Object
  /**
    *
    */
  var mvc: js.Object
  /**
    *
    */
  var openlayers: js.Object
  /**
    *
    */
  var rails: js.Object
  /**
    *
    */
  var robot: js.Object
  /**
    *
    */
  var rpc: js.Object
  /**
    *
    */
  var secure: js.Object
  /**
    *
    */
  var sketch: js.Object
  /**
    *
    */
  var sql: js.Object
  /**
    *
    */
  var string: js.Object
  /**
    *
    */
  var testing: js.Object
  /**
    *
    */
  var timing: js.Object
  /**
    *
    */
  var treemap: js.Object
  /**
    *
    */
  var uuid: js.Object
  /**
    *
    */
  var validate: js.Object
  /**
    *
    */
  var widget: js.Object
  /**
    *
    */
  var xml: js.Object
  /**
    * Provides a simple socket connection using WebSocket, or alternate
    * communication mechanisms in legacy browsers for comet-style communication. This is based
    * on the WebSocket API and returns an object that implements the WebSocket interface:
    * http://dev.w3.org/html5/websockets/#websocket
    * Provides socket connections. This can be used with virtually any Comet protocol.
    *
    * @param argsOrUrl This uses the same arguments as the other I/O functions in Dojo, or aURL to connect to. The URL should be a relative URL in order to properlywork with WebSockets (it can still be host relative, like //other-site.org/endpoint)
    */
  def socket(argsOrUrl: js.Object): js.Any
  /**
    *
    * @param format
    * @param filler
    */
  def sprintf(format: String, filler: js.Any): Unit
}

object dojox {
  @scala.inline
  def apply(
    BidiComplex: js.Object,
    analytics: js.Object,
    app: js.Object,
    atom: js.Object,
    av: js.Object,
    calc: js.Object,
    calendar: js.Object,
    charting: js.Object,
    collections: js.Object,
    color: js.Object,
    css3: js.Object,
    data: js.Object,
    date: js.Object,
    dgauges: js.Object,
    dnd: js.Object,
    drawing: js.Object,
    dtl: js.Object,
    editor: js.Object,
    embed: js.Object,
    encoding: js.Object,
    enhanced: js.Object,
    flash: js.Object,
    form: js.Object,
    fx: js.Object,
    gantt: js.Object,
    gauges: js.Object,
    geo: js.Object,
    gesture: js.Object,
    gfx: js.Object,
    gfx3d: js.Object,
    grid: js.Object,
    help: js.Object,
    highlight: js.Object,
    html: js.Object,
    image: js.Object,
    io: js.Object,
    jq: js.Object,
    json: js.Object,
    jsonPath: js.Object,
    lang: js.Object,
    layout: js.Object,
    math: js.Object,
    mdnd: js.Object,
    mobile: js.Object,
    mvc: js.Object,
    openlayers: js.Object,
    rails: js.Object,
    robot: js.Object,
    rpc: js.Object,
    secure: js.Object,
    sketch: js.Object,
    socket: js.Object => js.Any,
    sprintf: (String, js.Any) => Unit,
    sql: js.Object,
    string: js.Object,
    testing: js.Object,
    timing: js.Object,
    treemap: js.Object,
    uuid: js.Object,
    validate: js.Object,
    widget: js.Object,
    xml: js.Object
  ): dojox = {
    val __obj = js.Dynamic.literal(BidiComplex = BidiComplex, analytics = analytics, app = app, atom = atom, av = av, calc = calc, calendar = calendar, charting = charting, collections = collections, color = color, css3 = css3, data = data, date = date, dgauges = dgauges, dnd = dnd, drawing = drawing, dtl = dtl, editor = editor, embed = embed, encoding = encoding, enhanced = enhanced, flash = flash, form = form, fx = fx, gantt = gantt, gauges = gauges, geo = geo, gesture = gesture, gfx = gfx, gfx3d = gfx3d, grid = grid, help = help, highlight = highlight, html = html, image = image, io = io, jq = jq, json = json, jsonPath = jsonPath, lang = lang, layout = layout, math = math, mdnd = mdnd, mobile = mobile, mvc = mvc, openlayers = openlayers, rails = rails, robot = robot, rpc = rpc, secure = secure, sketch = sketch, socket = js.Any.fromFunction1(socket), sprintf = js.Any.fromFunction2(sprintf), sql = sql, string = string, testing = testing, timing = timing, treemap = treemap, uuid = uuid, validate = validate, widget = widget, xml = xml)
  
    __obj.asInstanceOf[dojox]
  }
}


package typings.esfxCanceltoken

import typings.esfxCanceltoken.esfxCanceltokenStrings.connectionstatechange
import typings.esfxCanceltoken.esfxCanceltokenStrings.datachannel
import typings.esfxCanceltoken.esfxCanceltokenStrings.icecandidate
import typings.esfxCanceltoken.esfxCanceltokenStrings.icecandidateerror
import typings.esfxCanceltoken.esfxCanceltokenStrings.iceconnectionstatechange
import typings.esfxCanceltoken.esfxCanceltokenStrings.icegatheringstatechange
import typings.esfxCanceltoken.esfxCanceltokenStrings.negotiationneeded
import typings.esfxCanceltoken.esfxCanceltokenStrings.signalingstatechange
import typings.esfxCanceltoken.esfxCanceltokenStrings.track
import typings.std.Event
import typings.std.EventListenerOrEventListenerObject
import typings.std.RTCDataChannelEvent
import typings.std.RTCPeerConnectionIceEvent
import typings.std.RTCTrackEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCPeerConnection extends StObject {
  
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def addEventListener(
    `type`: String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionstatechange(
    `type`: connectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datachannel(
    `type`: datachannel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCDataChannelEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidate(
    `type`: icecandidate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCPeerConnectionIceEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(`type`: icecandidateerror, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icecandidateerror(
    `type`: icecandidateerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_iceconnectionstatechange(
    `type`: iceconnectionstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_icegatheringstatechange(
    `type`: icegatheringstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(`type`: negotiationneeded, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_negotiationneeded(
    `type`: negotiationneeded,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_signalingstatechange(
    `type`: signalingstatechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(`type`: track, listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_track(
    `type`: track,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ RTCTrackEvent, Any],
    options: AddEventListenerOptionsWithCancelToken
  ): Unit = js.native
}

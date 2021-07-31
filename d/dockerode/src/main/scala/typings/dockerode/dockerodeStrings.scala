package typings.dockerode

import typings.dockerode.mod.LoggingDriverType
import typings.dockerode.mod.MountConsistency
import typings.dockerode.mod.MountPropagation
import typings.dockerode.mod.MountType
import typings.dockerode.mod.UpdateState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dockerodeStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with MountConsistency
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait attachment extends StObject
  @scala.inline
  def attachment: attachment = "attachment".asInstanceOf[attachment]
  
  @js.native
  sealed trait awslogs
    extends StObject
       with LoggingDriverType
  @scala.inline
  def awslogs: awslogs = "awslogs".asInstanceOf[awslogs]
  
  @js.native
  sealed trait bind
    extends StObject
       with MountType
  @scala.inline
  def bind: bind = "bind".asInstanceOf[bind]
  
  @js.native
  sealed trait cached
    extends StObject
       with MountConsistency
  @scala.inline
  def cached: cached = "cached".asInstanceOf[cached]
  
  @js.native
  sealed trait cfssl extends StObject
  @scala.inline
  def cfssl: cfssl = "cfssl".asInstanceOf[cfssl]
  
  @js.native
  sealed trait completed
    extends StObject
       with UpdateState
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait config extends StObject
  @scala.inline
  def config: config = "config".asInstanceOf[config]
  
  @js.native
  sealed trait consistent
    extends StObject
       with MountConsistency
  @scala.inline
  def consistent: consistent = "consistent".asInstanceOf[consistent]
  
  @js.native
  sealed trait container extends StObject
  @scala.inline
  def container: container = "container".asInstanceOf[container]
  
  @js.native
  sealed trait daemon extends StObject
  @scala.inline
  def daemon: daemon = "daemon".asInstanceOf[daemon]
  
  @js.native
  sealed trait delegated
    extends StObject
       with MountConsistency
  @scala.inline
  def delegated: delegated = "delegated".asInstanceOf[delegated]
  
  @js.native
  sealed trait etwlogs
    extends StObject
       with LoggingDriverType
  @scala.inline
  def etwlogs: etwlogs = "etwlogs".asInstanceOf[etwlogs]
  
  @js.native
  sealed trait fluentd
    extends StObject
       with LoggingDriverType
  @scala.inline
  def fluentd: fluentd = "fluentd".asInstanceOf[fluentd]
  
  @js.native
  sealed trait gelf
    extends StObject
       with LoggingDriverType
  @scala.inline
  def gelf: gelf = "gelf".asInstanceOf[gelf]
  
  @js.native
  sealed trait global extends StObject
  @scala.inline
  def global: global = "global".asInstanceOf[global]
  
  @js.native
  sealed trait host extends StObject
  @scala.inline
  def host: host = "host".asInstanceOf[host]
  
  @js.native
  sealed trait http extends StObject
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https extends StObject
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait image extends StObject
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait ingress extends StObject
  @scala.inline
  def ingress: ingress = "ingress".asInstanceOf[ingress]
  
  @js.native
  sealed trait journald
    extends StObject
       with LoggingDriverType
  @scala.inline
  def journald: journald = "journald".asInstanceOf[journald]
  
  @js.native
  sealed trait `json-file`
    extends StObject
       with LoggingDriverType
  @scala.inline
  def `json-file`: `json-file` = "json-file".asInstanceOf[`json-file`]
  
  @js.native
  sealed trait local extends StObject
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait network extends StObject
  @scala.inline
  def network: network = "network".asInstanceOf[network]
  
  @js.native
  sealed trait `next-exit` extends StObject
  @scala.inline
  def `next-exit`: `next-exit` = "next-exit".asInstanceOf[`next-exit`]
  
  @js.native
  sealed trait node extends StObject
  @scala.inline
  def node: node = "node".asInstanceOf[node]
  
  @js.native
  sealed trait none
    extends StObject
       with LoggingDriverType
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait `not-running` extends StObject
  @scala.inline
  def `not-running`: `not-running` = "not-running".asInstanceOf[`not-running`]
  
  @js.native
  sealed trait paused
    extends StObject
       with UpdateState
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait plugin extends StObject
  @scala.inline
  def plugin: plugin = "plugin".asInstanceOf[plugin]
  
  @js.native
  sealed trait `private`
    extends StObject
       with MountPropagation
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait removed extends StObject
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait replicated extends StObject
  @scala.inline
  def replicated: replicated = "replicated".asInstanceOf[replicated]
  
  @js.native
  sealed trait rollback_completed
    extends StObject
       with UpdateState
  @scala.inline
  def rollback_completed: rollback_completed = "rollback_completed".asInstanceOf[rollback_completed]
  
  @js.native
  sealed trait rollback_paused
    extends StObject
       with UpdateState
  @scala.inline
  def rollback_paused: rollback_paused = "rollback_paused".asInstanceOf[rollback_paused]
  
  @js.native
  sealed trait rollback_started
    extends StObject
       with UpdateState
  @scala.inline
  def rollback_started: rollback_started = "rollback_started".asInstanceOf[rollback_started]
  
  @js.native
  sealed trait rprivate
    extends StObject
       with MountPropagation
  @scala.inline
  def rprivate: rprivate = "rprivate".asInstanceOf[rprivate]
  
  @js.native
  sealed trait rshared
    extends StObject
       with MountPropagation
  @scala.inline
  def rshared: rshared = "rshared".asInstanceOf[rshared]
  
  @js.native
  sealed trait rslave
    extends StObject
       with MountPropagation
  @scala.inline
  def rslave: rslave = "rslave".asInstanceOf[rslave]
  
  @js.native
  sealed trait sctp extends StObject
  @scala.inline
  def sctp: sctp = "sctp".asInstanceOf[sctp]
  
  @js.native
  sealed trait secret extends StObject
  @scala.inline
  def secret: secret = "secret".asInstanceOf[secret]
  
  @js.native
  sealed trait service extends StObject
  @scala.inline
  def service: service = "service".asInstanceOf[service]
  
  @js.native
  sealed trait shared
    extends StObject
       with MountPropagation
  @scala.inline
  def shared: shared = "shared".asInstanceOf[shared]
  
  @js.native
  sealed trait slave
    extends StObject
       with MountPropagation
  @scala.inline
  def slave: slave = "slave".asInstanceOf[slave]
  
  @js.native
  sealed trait splunk
    extends StObject
       with LoggingDriverType
  @scala.inline
  def splunk: splunk = "splunk".asInstanceOf[splunk]
  
  @js.native
  sealed trait ssh extends StObject
  @scala.inline
  def ssh: ssh = "ssh".asInstanceOf[ssh]
  
  @js.native
  sealed trait swarm extends StObject
  @scala.inline
  def swarm: swarm = "swarm".asInstanceOf[swarm]
  
  @js.native
  sealed trait syslog
    extends StObject
       with LoggingDriverType
  @scala.inline
  def syslog: syslog = "syslog".asInstanceOf[syslog]
  
  @js.native
  sealed trait tcp extends StObject
  @scala.inline
  def tcp: tcp = "tcp".asInstanceOf[tcp]
  
  @js.native
  sealed trait tmpfs
    extends StObject
       with MountType
  @scala.inline
  def tmpfs: tmpfs = "tmpfs".asInstanceOf[tmpfs]
  
  @js.native
  sealed trait udp extends StObject
  @scala.inline
  def udp: udp = "udp".asInstanceOf[udp]
  
  @js.native
  sealed trait updating
    extends StObject
       with UpdateState
  @scala.inline
  def updating: updating = "updating".asInstanceOf[updating]
  
  @js.native
  sealed trait volume
    extends StObject
       with MountType
  @scala.inline
  def volume: volume = "volume".asInstanceOf[volume]
}

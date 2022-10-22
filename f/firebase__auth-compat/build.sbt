organization := "org.scalablytyped"
name := "firebase__auth-compat"
version := "0.2.23-3149d4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.8.2-89416d",
  "org.scalablytyped" %%% "firebase__app-compat" % "0.1.37-6bcb08",
  "org.scalablytyped" %%% "firebase__app-types" % "0.8.0-7e39e4",
  "org.scalablytyped" %%% "firebase__auth" % "0.20.10-769e85",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.6-d88ada",
  "org.scalablytyped" %%% "firebase__auth-types" % "0.11.0-a60747",
  "org.scalablytyped" %%% "firebase__component" % "0.5.20-e0fad8",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-fcc6c3",
  "org.scalablytyped" %%% "firebase__util" % "1.7.2-632c97",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.1-dt-20221018Z-e8d527",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "ws" % "8.5-dt-20220624Z-a7f58f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
